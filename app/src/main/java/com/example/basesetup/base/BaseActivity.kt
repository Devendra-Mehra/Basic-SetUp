package com.example.basesetup.base

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import dagger.android.AndroidInjection

abstract class BaseActivity<Binding : ViewDataBinding> : AppCompatActivity() {

    private lateinit var dataBinding: Binding
    private var appPermission: AppPermission? = null


    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
         AndroidInjection.inject(this)
        super.onCreate(savedInstanceState, persistentState)
        dataBinding = DataBindingUtil.setContentView(this, getLayoutResource())
        setUp()
        setUpAppPermission()

    }

    fun getAppPermission(): AppPermission {
        return AppPermission()
    }

    private fun setUpAppPermission() {
        this.appPermission = if (appPermission == null) getAppPermission() else appPermission
    }

    fun showToastFromResource(toastMessage: Int) =
        Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show()


    fun showToast(toastMessage: String) =
        Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show()


    protected abstract fun getLayoutResource(): Int

    protected abstract fun setUp()
}