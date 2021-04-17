package com.example.android.archelon_sea_turtle_project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class OptionsFragmentBinding extends ViewDataBinding {
  @NonNull
  public final Button emergencyRelocationButton;

  @NonNull
  public final Button nestCheckButton;

  @NonNull
  public final ConstraintLayout optionsLayout;

  @NonNull
  public final Button startExcavationButton;

  @NonNull
  public final Button startSurveyButton;

  protected OptionsFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button emergencyRelocationButton, Button nestCheckButton, ConstraintLayout optionsLayout,
      Button startExcavationButton, Button startSurveyButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.emergencyRelocationButton = emergencyRelocationButton;
    this.nestCheckButton = nestCheckButton;
    this.optionsLayout = optionsLayout;
    this.startExcavationButton = startExcavationButton;
    this.startSurveyButton = startSurveyButton;
  }

  @NonNull
  public static OptionsFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.options_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static OptionsFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<OptionsFragmentBinding>inflateInternal(inflater, com.example.android.archelon_sea_turtle_project.R.layout.options_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static OptionsFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.options_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static OptionsFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<OptionsFragmentBinding>inflateInternal(inflater, com.example.android.archelon_sea_turtle_project.R.layout.options_fragment, null, false, component);
  }

  public static OptionsFragmentBinding bind(@NonNull View view) {
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
  public static OptionsFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (OptionsFragmentBinding)bind(component, view, com.example.android.archelon_sea_turtle_project.R.layout.options_fragment);
  }
}
