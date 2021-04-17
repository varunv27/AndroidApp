package com.example.android.archelon_sea_turtle_project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LoginFragmentBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageView;

  @NonNull
  public final Button loginButton;

  @NonNull
  public final EditText passwordText;

  @NonNull
  public final TextView projectDescriptionText;

  @NonNull
  public final ConstraintLayout titleLayout;

  @NonNull
  public final EditText usernameText;

  protected LoginFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageView, Button loginButton, EditText passwordText,
      TextView projectDescriptionText, ConstraintLayout titleLayout, EditText usernameText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView = imageView;
    this.loginButton = loginButton;
    this.passwordText = passwordText;
    this.projectDescriptionText = projectDescriptionText;
    this.titleLayout = titleLayout;
    this.usernameText = usernameText;
  }

  @NonNull
  public static LoginFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.login_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LoginFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LoginFragmentBinding>inflateInternal(inflater, com.example.android.archelon_sea_turtle_project.R.layout.login_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static LoginFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.login_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LoginFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LoginFragmentBinding>inflateInternal(inflater, com.example.android.archelon_sea_turtle_project.R.layout.login_fragment, null, false, component);
  }

  public static LoginFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static LoginFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (LoginFragmentBinding)bind(component, view, com.example.android.archelon_sea_turtle_project.R.layout.login_fragment);
  }
}
