package com.example.android.archelon_sea_turtle_project.screens.options;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class OptionsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private OptionsFragmentArgs() {
  }

  private OptionsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static OptionsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    OptionsFragmentArgs __result = new OptionsFragmentArgs();
    bundle.setClassLoader(OptionsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("token")) {
      String token;
      token = bundle.getString("token");
      if (token == null) {
        throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("token", token);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getToken() {
    return (String) arguments.get("token");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("token")) {
      String token = (String) arguments.get("token");
      __result.putString("token", token);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    OptionsFragmentArgs that = (OptionsFragmentArgs) object;
    if (arguments.containsKey("token") != that.arguments.containsKey("token")) {
      return false;
    }
    if (getToken() != null ? !getToken().equals(that.getToken()) : that.getToken() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getToken() != null ? getToken().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "OptionsFragmentArgs{"
        + "token=" + getToken()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(OptionsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public OptionsFragmentArgs build() {
      OptionsFragmentArgs result = new OptionsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setToken(@NonNull String token) {
      if (token == null) {
        throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("token", token);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getToken() {
      return (String) arguments.get("token");
    }
  }
}
