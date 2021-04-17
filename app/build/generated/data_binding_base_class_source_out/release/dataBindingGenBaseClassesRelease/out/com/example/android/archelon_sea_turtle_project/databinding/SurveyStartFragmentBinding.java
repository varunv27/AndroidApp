package com.example.android.archelon_sea_turtle_project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class SurveyStartFragmentBinding extends ViewDataBinding {
  @NonNull
  public final EditText AreaText;

  @NonNull
  public final Button BackButton;

  @NonNull
  public final EditText BeachText;

  @NonNull
  public final EditText CommentsText;

  @NonNull
  public final EditText DistancetoSeaText;

  @NonNull
  public final EditText EmergenceEventText;

  @NonNull
  public final EditText NestText;

  @NonNull
  public final Button NextButton;

  @NonNull
  public final EditText NonNestingAttemptsText;

  @NonNull
  public final EditText SectorText;

  @NonNull
  public final EditText SubSectorText;

  @NonNull
  public final EditText TrackTypeText;

  @NonNull
  public final DatePicker datePicker;

  @NonNull
  public final EditText photoIDText;

  @NonNull
  public final ConstraintLayout surveyStartLayout;

  @NonNull
  public final EditText tagsText;

  protected SurveyStartFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText AreaText, Button BackButton, EditText BeachText, EditText CommentsText,
      EditText DistancetoSeaText, EditText EmergenceEventText, EditText NestText, Button NextButton,
      EditText NonNestingAttemptsText, EditText SectorText, EditText SubSectorText,
      EditText TrackTypeText, DatePicker datePicker, EditText photoIDText,
      ConstraintLayout surveyStartLayout, EditText tagsText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.AreaText = AreaText;
    this.BackButton = BackButton;
    this.BeachText = BeachText;
    this.CommentsText = CommentsText;
    this.DistancetoSeaText = DistancetoSeaText;
    this.EmergenceEventText = EmergenceEventText;
    this.NestText = NestText;
    this.NextButton = NextButton;
    this.NonNestingAttemptsText = NonNestingAttemptsText;
    this.SectorText = SectorText;
    this.SubSectorText = SubSectorText;
    this.TrackTypeText = TrackTypeText;
    this.datePicker = datePicker;
    this.photoIDText = photoIDText;
    this.surveyStartLayout = surveyStartLayout;
    this.tagsText = tagsText;
  }

  @NonNull
  public static SurveyStartFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.survey_start_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SurveyStartFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SurveyStartFragmentBinding>inflateInternal(inflater, com.example.android.archelon_sea_turtle_project.R.layout.survey_start_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static SurveyStartFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.survey_start_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SurveyStartFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SurveyStartFragmentBinding>inflateInternal(inflater, com.example.android.archelon_sea_turtle_project.R.layout.survey_start_fragment, null, false, component);
  }

  public static SurveyStartFragmentBinding bind(@NonNull View view) {
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
  public static SurveyStartFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (SurveyStartFragmentBinding)bind(component, view, com.example.android.archelon_sea_turtle_project.R.layout.survey_start_fragment);
  }
}
