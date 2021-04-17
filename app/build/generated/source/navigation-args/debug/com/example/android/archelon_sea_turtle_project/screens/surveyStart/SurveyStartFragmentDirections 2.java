package com.example.android.archelon_sea_turtle_project.screens.surveyStart;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.android.archelon_sea_turtle_project.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class SurveyStartFragmentDirections {
  private SurveyStartFragmentDirections() {
  }

  @NonNull
  public static BackToOptionsPage backToOptionsPage() {
    return new BackToOptionsPage();
  }

  public static class BackToOptionsPage implements NavDirections {
    private final HashMap arguments = new HashMap();

    private BackToOptionsPage() {
    }

    @NonNull
    public BackToOptionsPage setToken(@NonNull String token) {
      if (token == null) {
        throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("token", token);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("token")) {
        String token = (String) arguments.get("token");
        __result.putString("token", token);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.back_to_options_page;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getToken() {
      return (String) arguments.get("token");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      BackToOptionsPage that = (BackToOptionsPage) object;
      if (arguments.containsKey("token") != that.arguments.containsKey("token")) {
        return false;
      }
      if (getToken() != null ? !getToken().equals(that.getToken()) : that.getToken() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getToken() != null ? getToken().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "BackToOptionsPage(actionId=" + getActionId() + "){"
          + "token=" + getToken()
          + "}";
    }
  }
}
