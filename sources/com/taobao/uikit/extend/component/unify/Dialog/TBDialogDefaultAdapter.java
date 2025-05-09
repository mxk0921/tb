package com.taobao.uikit.extend.component.unify.Dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog;
import com.taobao.uikit.extend.utils.TintHelper;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBDialogDefaultAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final TBMaterialDialog dialog;
    private final GravityEnum itemGravity;
    private final int layout;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.uikit.extend.component.unify.Dialog.TBDialogDefaultAdapter$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$TBMaterialDialog$ListType;

        static {
            int[] iArr = new int[TBMaterialDialog.ListType.values().length];
            $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$TBMaterialDialog$ListType = iArr;
            try {
                iArr[TBMaterialDialog.ListType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$TBMaterialDialog$ListType[TBMaterialDialog.ListType.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        t2o.a(932184142);
    }

    public TBDialogDefaultAdapter(TBMaterialDialog tBMaterialDialog, int i) {
        this.dialog = tBMaterialDialog;
        this.layout = i;
        this.itemGravity = tBMaterialDialog.mBuilder.itemsGravity;
    }

    public static /* synthetic */ Object ipc$super(TBDialogDefaultAdapter tBDialogDefaultAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/unify/Dialog/TBDialogDefaultAdapter");
    }

    private boolean isRTL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff933d6b", new Object[]{this})).booleanValue();
        }
        if (this.dialog.getBuilder().getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    private void setupGravity(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef2bf157", new Object[]{this, viewGroup});
            return;
        }
        ((LinearLayout) viewGroup).setGravity(this.itemGravity.getGravityInt() | 16);
        if (viewGroup.getChildCount() != 2) {
            return;
        }
        if (this.itemGravity == GravityEnum.END && !isRTL() && (viewGroup.getChildAt(0) instanceof CompoundButton)) {
            CompoundButton compoundButton = (CompoundButton) viewGroup.getChildAt(0);
            viewGroup.removeView(compoundButton);
            TextView textView = (TextView) viewGroup.getChildAt(0);
            viewGroup.removeView(textView);
            textView.setPadding(textView.getPaddingRight(), textView.getPaddingTop(), textView.getPaddingLeft(), textView.getPaddingBottom());
            viewGroup.addView(textView);
            viewGroup.addView(compoundButton);
        } else if (this.itemGravity == GravityEnum.START && isRTL() && (viewGroup.getChildAt(1) instanceof CompoundButton)) {
            CompoundButton compoundButton2 = (CompoundButton) viewGroup.getChildAt(1);
            viewGroup.removeView(compoundButton2);
            TextView textView2 = (TextView) viewGroup.getChildAt(0);
            viewGroup.removeView(textView2);
            textView2.setPadding(textView2.getPaddingRight(), textView2.getPaddingTop(), textView2.getPaddingRight(), textView2.getPaddingBottom());
            viewGroup.addView(compoundButton2);
            viewGroup.addView(textView2);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        TBSimpleListItem[] tBSimpleListItemArr = this.dialog.mBuilder.items;
        if (tBSimpleListItemArr != null) {
            return tBSimpleListItemArr.length;
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        return this.dialog.mBuilder.items[i];
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        if (view == null) {
            view = LayoutInflater.from(this.dialog.getContext()).inflate(this.layout, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.uik_mdTitle);
        int i2 = AnonymousClass1.$SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$TBMaterialDialog$ListType[this.dialog.listType.ordinal()];
        if (i2 == 1) {
            RadioButton radioButton = (RadioButton) view.findViewById(R.id.uik_mdControl);
            TBMaterialDialog.Builder builder = this.dialog.mBuilder;
            if (builder.selectedIndex == i) {
                z = true;
            } else {
                z = false;
            }
            TintHelper.setTint(radioButton, builder.widgetColor);
            radioButton.setChecked(z);
        } else if (i2 == 2) {
            CheckBox checkBox = (CheckBox) view.findViewById(R.id.uik_mdControl);
            boolean contains = this.dialog.selectedIndicesList.contains(Integer.valueOf(i));
            TintHelper.setTint(checkBox, this.dialog.mBuilder.widgetColor);
            checkBox.setChecked(contains);
        }
        textView.setText(this.dialog.mBuilder.items[i].getText());
        TBSimpleListItemType type = this.dialog.mBuilder.items[i].getType();
        if (type == null) {
            textView.setTextColor(this.dialog.mBuilder.itemColor);
        } else if (type == TBSimpleListItemType.NORMAL) {
            textView.setTextColor(ContextCompat.getColor(view.getContext(), R.color.uik_mdListItemNormal));
        } else if (type == TBSimpleListItemType.ALERT) {
            textView.setTextColor(ContextCompat.getColor(view.getContext(), R.color.uik_mdListItemAlert));
        }
        view.setTag(i + ":" + this.dialog.mBuilder.items[i]);
        ViewGroup viewGroup2 = (ViewGroup) view;
        setupGravity(viewGroup2);
        int[] iArr = this.dialog.mBuilder.itemIds;
        if (iArr != null) {
            if (i < iArr.length) {
                view.setId(iArr[i]);
            } else {
                view.setId(-1);
            }
        }
        if (viewGroup2.getChildCount() == 2) {
            if (viewGroup2.getChildAt(0) instanceof CompoundButton) {
                viewGroup2.getChildAt(0).setBackground(null);
            } else if (viewGroup2.getChildAt(1) instanceof CompoundButton) {
                viewGroup2.getChildAt(1).setBackground(null);
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35312b0e", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
