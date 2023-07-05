// Generated by view binder compiler. Do not edit!
package com.alessandroorozco.prueba.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alessandroorozco.prueba.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final Guideline guidelineHorizo;

  @NonNull
  public final ImageView imgAdidasLogo;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextInputLayout tilEmail;

  @NonNull
  public final TextInputLayout tilPassword;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnLogin,
      @NonNull Guideline guidelineHorizo, @NonNull ImageView imgAdidasLogo,
      @NonNull TextView textView, @NonNull TextInputLayout tilEmail,
      @NonNull TextInputLayout tilPassword) {
    this.rootView = rootView;
    this.btnLogin = btnLogin;
    this.guidelineHorizo = guidelineHorizo;
    this.imgAdidasLogo = imgAdidasLogo;
    this.textView = textView;
    this.tilEmail = tilEmail;
    this.tilPassword = tilPassword;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_login;
      Button btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.guideline_horizo;
      Guideline guidelineHorizo = ViewBindings.findChildViewById(rootView, id);
      if (guidelineHorizo == null) {
        break missingId;
      }

      id = R.id.img_adidas_logo;
      ImageView imgAdidasLogo = ViewBindings.findChildViewById(rootView, id);
      if (imgAdidasLogo == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.til_email;
      TextInputLayout tilEmail = ViewBindings.findChildViewById(rootView, id);
      if (tilEmail == null) {
        break missingId;
      }

      id = R.id.til_password;
      TextInputLayout tilPassword = ViewBindings.findChildViewById(rootView, id);
      if (tilPassword == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, btnLogin, guidelineHorizo,
          imgAdidasLogo, textView, tilEmail, tilPassword);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
