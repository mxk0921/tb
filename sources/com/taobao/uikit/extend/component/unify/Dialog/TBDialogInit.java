package com.taobao.uikit.extend.component.unify.Dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog;
import com.taobao.uikit.extend.utils.ResourceUtils;
import java.util.ArrayList;
import java.util.Arrays;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBDialogInit {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(932184144);
    }

    public static int getInflateLayout(TBMaterialDialog.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19f324ca", new Object[]{builder})).intValue();
        }
        if (builder.customView != null) {
            return R.layout.uik_md_dialog_custom;
        }
        TBSimpleListItem[] tBSimpleListItemArr = builder.items;
        if ((tBSimpleListItemArr == null || tBSimpleListItemArr.length <= 0) && builder.adapter == null) {
            return R.layout.uik_md_dialog_basic;
        }
        return R.layout.uik_md_dialog_list;
    }

    public static int getTheme(TBMaterialDialog.Builder builder) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25892812", new Object[]{builder})).intValue();
        }
        Context context = builder.context;
        int i = R.attr.uik_mdDarkTheme;
        Theme theme = builder.theme;
        Theme theme2 = Theme.DARK;
        if (theme == theme2) {
            z = true;
        }
        boolean resolveBoolean = ResourceUtils.resolveBoolean(context, i, z);
        if (!resolveBoolean) {
            theme2 = Theme.LIGHT;
        }
        builder.theme = theme2;
        if (resolveBoolean) {
            return R.style.TBMD_Dark;
        }
        return R.style.TBMD_Light;
    }

    public static void init(TBMaterialDialog tBMaterialDialog) {
        TBSimpleListItem[] tBSimpleListItemArr;
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d19a579", new Object[]{tBMaterialDialog});
            return;
        }
        TBMaterialDialog.Builder builder = tBMaterialDialog.mBuilder;
        tBMaterialDialog.setCancelable(builder.cancelable);
        tBMaterialDialog.setCanceledOnTouchOutside(builder.cancelable);
        if (builder.backgroundColor == 0) {
            builder.backgroundColor = ResourceUtils.resolveColor(builder.context, R.attr.uik_mdBackgroundColor);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(builder.context.getResources().getDimension(R.dimen.uik_mdBgCornerRadius));
            gradientDrawable.setColor(builder.backgroundColor);
            ResourceUtils.setBackgroundCompat(tBMaterialDialog.view, gradientDrawable);
            tBMaterialDialog.view.setBackgroundColor(ResourceUtils.getColor(builder.context, 17170445));
        }
        if (!builder.positiveColorSet) {
            builder.positiveColor = ResourceUtils.resolveActionTextColorStateList(builder.context, R.attr.uik_mdPositiveColor, builder.positiveColor);
        }
        if (!builder.neutralColorSet) {
            builder.neutralColor = ResourceUtils.resolveActionTextColorStateList(builder.context, R.attr.uik_mdNeutralColor, builder.neutralColor);
        }
        if (!builder.negativeColorSet) {
            builder.negativeColor = ResourceUtils.resolveActionTextColorStateList(builder.context, R.attr.uik_mdNegativeColor, builder.negativeColor);
        }
        if (!builder.widgetColorSet) {
            builder.widgetColor = ResourceUtils.resolveColor(builder.context, R.attr.uik_mdWidgetColor, builder.widgetColor);
        }
        if (!builder.titleColorSet) {
            builder.titleColor = ResourceUtils.resolveColor(builder.context, R.attr.uik_mdTitleColor, ResourceUtils.getColor(tBMaterialDialog.getContext(), R.color.uik_mdContentColor));
        }
        if (!builder.contentColorSet) {
            builder.contentColor = ResourceUtils.resolveColor(builder.context, R.attr.uik_mdContentColor, ResourceUtils.getColor(tBMaterialDialog.getContext(), R.color.uik_mdContentColor));
        }
        if (!builder.itemColorSet) {
            builder.itemColor = ResourceUtils.resolveColor(builder.context, R.attr.uik_mdItemColor, builder.contentColor);
        }
        tBMaterialDialog.title = (TextView) tBMaterialDialog.view.findViewById(R.id.uik_mdTitle);
        tBMaterialDialog.icon = (ImageView) tBMaterialDialog.view.findViewById(R.id.uik_mdIcon);
        tBMaterialDialog.titleFrame = tBMaterialDialog.view.findViewById(R.id.uik_mdTitleFrame);
        tBMaterialDialog.content = (TextView) tBMaterialDialog.view.findViewById(R.id.uik_mdContent);
        tBMaterialDialog.listView = (ListView) tBMaterialDialog.view.findViewById(R.id.uik_mdContentListView);
        tBMaterialDialog.positiveButton = (TBDialogButton) tBMaterialDialog.view.findViewById(R.id.uik_mdButtonDefaultPositive);
        tBMaterialDialog.neutralButton = (TBDialogButton) tBMaterialDialog.view.findViewById(R.id.uik_mdButtonDefaultNeutral);
        tBMaterialDialog.negativeButton = (TBDialogButton) tBMaterialDialog.view.findViewById(R.id.uik_mdButtonDefaultNegative);
        tBMaterialDialog.closeButton = (ImageView) tBMaterialDialog.view.findViewById(R.id.uik_mdButtonClose);
        TBDialogButton tBDialogButton = tBMaterialDialog.positiveButton;
        if (tBDialogButton != null) {
            if (builder.positiveText != null) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            tBDialogButton.setVisibility(i3);
        }
        TBDialogButton tBDialogButton2 = tBMaterialDialog.neutralButton;
        if (tBDialogButton2 != null) {
            if (builder.neutralText != null) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            tBDialogButton2.setVisibility(i2);
        }
        TBDialogButton tBDialogButton3 = tBMaterialDialog.negativeButton;
        if (tBDialogButton3 != null) {
            if (builder.negativeText != null) {
                i = 0;
            } else {
                i = 8;
            }
            tBDialogButton3.setVisibility(i);
        }
        ImageView imageView = tBMaterialDialog.icon;
        if (imageView != null) {
            if (builder.icon != null) {
                imageView.setVisibility(0);
                tBMaterialDialog.icon.setImageDrawable(builder.icon);
            } else {
                Drawable resolveDrawable = ResourceUtils.resolveDrawable(builder.context, R.attr.uik_mdIcon);
                if (resolveDrawable != null) {
                    tBMaterialDialog.icon.setVisibility(0);
                    tBMaterialDialog.icon.setImageDrawable(resolveDrawable);
                } else {
                    tBMaterialDialog.icon.setVisibility(8);
                }
            }
            int i4 = builder.maxIconSize;
            if (i4 == -1) {
                i4 = ResourceUtils.resolveDimension(builder.context, R.attr.uik_mdIconMaxSize);
            }
            if (builder.limitIconToDefaultSize || ResourceUtils.resolveBoolean(builder.context, R.attr.uik_mdIconLimitIconToDefaultSize)) {
                i4 = builder.context.getResources().getDimensionPixelSize(R.dimen.uik_mdIconMaxSize);
            }
            if (i4 > -1) {
                tBMaterialDialog.icon.setAdjustViewBounds(true);
                tBMaterialDialog.icon.setMaxHeight(i4);
                tBMaterialDialog.icon.setMaxWidth(i4);
                tBMaterialDialog.icon.requestLayout();
            }
        }
        if (!builder.dividerColorSet) {
            builder.dividerColor = ResourceUtils.resolveColor(builder.context, R.attr.uik_mdDividerColor, ResourceUtils.resolveColor(tBMaterialDialog.getContext(), R.attr.uik_mdDivider));
        }
        tBMaterialDialog.view.setDividerColor(builder.dividerColor);
        TextView textView = tBMaterialDialog.title;
        if (textView != null) {
            textView.setTextColor(builder.titleColor);
            tBMaterialDialog.title.setGravity(builder.titleGravity.getGravityInt());
            tBMaterialDialog.title.setTextAlignment(builder.titleGravity.getTextAlignment());
            CharSequence charSequence = builder.title;
            if (charSequence == null) {
                tBMaterialDialog.titleFrame.setVisibility(8);
            } else {
                tBMaterialDialog.title.setText(charSequence);
                tBMaterialDialog.titleFrame.setVisibility(0);
            }
        }
        TextView textView2 = tBMaterialDialog.content;
        if (textView2 != null) {
            textView2.setMovementMethod(new LinkMovementMethod());
            tBMaterialDialog.content.setLineSpacing(0.0f, builder.contentLineSpacingMultiplier);
            ColorStateList colorStateList = builder.linkColor;
            if (colorStateList == null) {
                tBMaterialDialog.content.setLinkTextColor(ResourceUtils.resolveColor(tBMaterialDialog.getContext(), 16842806));
            } else {
                tBMaterialDialog.content.setLinkTextColor(colorStateList);
            }
            tBMaterialDialog.content.setTextColor(builder.contentColor);
            tBMaterialDialog.content.setGravity(builder.contentGravity.getGravityInt());
            tBMaterialDialog.content.setTextAlignment(builder.contentGravity.getTextAlignment());
            CharSequence charSequence2 = builder.content;
            if (charSequence2 != null) {
                tBMaterialDialog.content.setText(charSequence2);
                tBMaterialDialog.content.setVisibility(0);
            } else {
                tBMaterialDialog.content.setVisibility(8);
            }
        }
        tBMaterialDialog.view.setButtonGravity(builder.buttonsGravity);
        tBMaterialDialog.view.setButtonStackedGravity(builder.btnStackedGravity);
        tBMaterialDialog.view.setForceStack(builder.forceStacking);
        boolean resolveBoolean = ResourceUtils.resolveBoolean(builder.context, 16843660, true);
        if (resolveBoolean) {
            resolveBoolean = ResourceUtils.resolveBoolean(builder.context, 16843660, true);
        }
        TBDialogButton tBDialogButton4 = tBMaterialDialog.positiveButton;
        if (tBDialogButton4 != null) {
            tBDialogButton4.setAllCapsCompat(resolveBoolean);
            tBDialogButton4.setText(builder.positiveText);
            tBDialogButton4.setTextColor(builder.positiveColor);
            TBDialogButton tBDialogButton5 = tBMaterialDialog.positiveButton;
            DialogAction dialogAction = DialogAction.POSITIVE;
            tBDialogButton5.setStackedSelector(tBMaterialDialog.getButtonSelector(dialogAction, true));
            tBMaterialDialog.positiveButton.setDefaultSelector(tBMaterialDialog.getButtonSelector(dialogAction, false));
            tBMaterialDialog.positiveButton.setTag(dialogAction);
            tBMaterialDialog.positiveButton.setOnClickListener(tBMaterialDialog);
            tBMaterialDialog.positiveButton.setVisibility(0);
        }
        TBDialogButton tBDialogButton6 = tBMaterialDialog.negativeButton;
        if (tBDialogButton6 != null) {
            tBDialogButton6.setAllCapsCompat(resolveBoolean);
            tBDialogButton6.setText(builder.negativeText);
            tBDialogButton6.setTextColor(builder.negativeColor);
            TBDialogButton tBDialogButton7 = tBMaterialDialog.negativeButton;
            DialogAction dialogAction2 = DialogAction.NEGATIVE;
            tBDialogButton7.setStackedSelector(tBMaterialDialog.getButtonSelector(dialogAction2, true));
            tBMaterialDialog.negativeButton.setDefaultSelector(tBMaterialDialog.getButtonSelector(dialogAction2, false));
            tBMaterialDialog.negativeButton.setTag(dialogAction2);
            tBMaterialDialog.negativeButton.setOnClickListener(tBMaterialDialog);
            tBMaterialDialog.negativeButton.setVisibility(0);
        }
        TBDialogButton tBDialogButton8 = tBMaterialDialog.neutralButton;
        if (tBDialogButton8 != null) {
            tBDialogButton8.setAllCapsCompat(resolveBoolean);
            tBDialogButton8.setText(builder.neutralText);
            tBDialogButton8.setTextColor(builder.neutralColor);
            TBDialogButton tBDialogButton9 = tBMaterialDialog.neutralButton;
            DialogAction dialogAction3 = DialogAction.NEUTRAL;
            tBDialogButton9.setStackedSelector(tBMaterialDialog.getButtonSelector(dialogAction3, true));
            tBMaterialDialog.neutralButton.setDefaultSelector(tBMaterialDialog.getButtonSelector(dialogAction3, false));
            tBMaterialDialog.neutralButton.setTag(dialogAction3);
            tBMaterialDialog.neutralButton.setOnClickListener(tBMaterialDialog);
            tBMaterialDialog.neutralButton.setVisibility(0);
        }
        ImageView imageView2 = tBMaterialDialog.closeButton;
        if (imageView2 != null) {
            imageView2.setTag(DialogAction.CLOSE);
            ViewProxy.setOnClickListener(imageView2, tBMaterialDialog);
        }
        if (builder.listCallbackMultiChoice != null) {
            tBMaterialDialog.selectedIndicesList = new ArrayList();
        }
        ListView listView = tBMaterialDialog.listView;
        if (listView != null && (((tBSimpleListItemArr = builder.items) != null && tBSimpleListItemArr.length > 0) || builder.adapter != null)) {
            listView.setSelector(tBMaterialDialog.getListSelector());
            ListAdapter listAdapter = builder.adapter;
            if (listAdapter == null) {
                if (builder.listCallbackSingleChoice != null) {
                    tBMaterialDialog.listType = TBMaterialDialog.ListType.SINGLE;
                } else if (builder.listCallbackMultiChoice != null) {
                    tBMaterialDialog.listType = TBMaterialDialog.ListType.MULTI;
                    if (builder.selectedIndices != null) {
                        tBMaterialDialog.selectedIndicesList = new ArrayList(Arrays.asList(builder.selectedIndices));
                        builder.selectedIndices = null;
                    }
                } else {
                    tBMaterialDialog.listType = TBMaterialDialog.ListType.REGULAR;
                }
                builder.adapter = new TBDialogDefaultAdapter(tBMaterialDialog, TBMaterialDialog.ListType.getLayoutForType(tBMaterialDialog.listType));
            } else if (listAdapter instanceof TBDialogAdapter) {
                ((TBDialogAdapter) listAdapter).setDialog(tBMaterialDialog);
            }
        }
        TBDialogRootLayout tBDialogRootLayout = tBMaterialDialog.view;
        tBDialogRootLayout.mCardDialog = builder.cardDialog;
        if (builder.customView != null) {
            ((TBDialogRootLayout) tBDialogRootLayout.findViewById(R.id.uik_mdRoot)).noTitleNoPadding();
            FrameLayout frameLayout = (FrameLayout) tBMaterialDialog.view.findViewById(R.id.uik_mdCustomViewFrame);
            tBMaterialDialog.customViewFrame = frameLayout;
            View view = builder.customView;
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (builder.wrapCustomViewInScroll) {
                Resources resources = tBMaterialDialog.getContext().getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.uik_mdDialogFrameMargin);
                ScrollView scrollView = new ScrollView(tBMaterialDialog.getContext());
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.uik_mdContentPaddingTop);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.uik_mdContentPaddingBottom);
                scrollView.setClipToPadding(false);
                if (view instanceof EditText) {
                    scrollView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3);
                } else {
                    scrollView.setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize3);
                    view.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                }
                scrollView.addView(view, new FrameLayout.LayoutParams(-1, -2));
                view = scrollView;
            }
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -2));
        }
        DialogInterface.OnShowListener onShowListener = builder.showListener;
        if (onShowListener != null) {
            tBMaterialDialog.setOnShowListener(onShowListener);
        }
        DialogInterface.OnCancelListener onCancelListener = builder.cancelListener;
        if (onCancelListener != null) {
            tBMaterialDialog.setOnCancelListener(onCancelListener);
        }
        DialogInterface.OnDismissListener onDismissListener = builder.dismissListener;
        if (onDismissListener != null) {
            tBMaterialDialog.setOnDismissListener(onDismissListener);
        }
        DialogInterface.OnKeyListener onKeyListener = builder.keyListener;
        if (onKeyListener != null) {
            tBMaterialDialog.setOnKeyListener(onKeyListener);
        }
        tBMaterialDialog.setOnShowListenerInternal();
        tBMaterialDialog.invalidateList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        if (builder.cardDialog) {
            tBMaterialDialog.setViewInternal(tBMaterialDialog.view, layoutParams);
        } else {
            tBMaterialDialog.setViewInternal(tBMaterialDialog.view);
        }
        tBMaterialDialog.checkIfListInitScroll();
    }
}
