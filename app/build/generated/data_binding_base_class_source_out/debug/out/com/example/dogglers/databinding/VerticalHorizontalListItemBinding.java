// Generated by view binder compiler. Do not edit!
package com.example.dogglers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.dogglers.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class VerticalHorizontalListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final TextView ageText;

  @NonNull
  public final TextView hobbiesText;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView nameText;

  private VerticalHorizontalListItemBinding(@NonNull MaterialCardView rootView,
      @NonNull TextView ageText, @NonNull TextView hobbiesText, @NonNull ImageView imageView,
      @NonNull TextView nameText) {
    this.rootView = rootView;
    this.ageText = ageText;
    this.hobbiesText = hobbiesText;
    this.imageView = imageView;
    this.nameText = nameText;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static VerticalHorizontalListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static VerticalHorizontalListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.vertical_horizontal_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static VerticalHorizontalListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.age_text;
      TextView ageText = rootView.findViewById(id);
      if (ageText == null) {
        break missingId;
      }

      id = R.id.hobbies_text;
      TextView hobbiesText = rootView.findViewById(id);
      if (hobbiesText == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = rootView.findViewById(id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.name_text;
      TextView nameText = rootView.findViewById(id);
      if (nameText == null) {
        break missingId;
      }

      return new VerticalHorizontalListItemBinding((MaterialCardView) rootView, ageText,
          hobbiesText, imageView, nameText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
