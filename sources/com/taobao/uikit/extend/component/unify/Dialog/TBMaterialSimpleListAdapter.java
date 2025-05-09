package com.taobao.uikit.extend.component.unify.Dialog;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBMaterialSimpleListAdapter extends ArrayAdapter<TBMaterialSimpleListItem> implements TBDialogAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TBMaterialDialog dialog;

    static {
        t2o.a(932184162);
        t2o.a(932184139);
    }

    public TBMaterialSimpleListAdapter(Context context) {
        super(context, R.layout.uik_md_simplelist_item, 16908310);
    }

    public static /* synthetic */ Object ipc$super(TBMaterialSimpleListAdapter tBMaterialSimpleListAdapter, String str, Object... objArr) {
        if (str.hashCode() == 662623122) {
            return super.getView(((Number) objArr[0]).intValue(), (View) objArr[1], (ViewGroup) objArr[2]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/unify/Dialog/TBMaterialSimpleListAdapter");
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return i;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        View view2 = super.getView(i, view, viewGroup);
        if (this.dialog != null) {
            TBMaterialSimpleListItem tBMaterialSimpleListItem = (TBMaterialSimpleListItem) getItem(i);
            ImageView imageView = (ImageView) view2.findViewById(16908294);
            if (tBMaterialSimpleListItem.getIcon() != null) {
                imageView.setImageDrawable(tBMaterialSimpleListItem.getIcon());
                imageView.setPadding(tBMaterialSimpleListItem.getIconPadding(), tBMaterialSimpleListItem.getIconPadding(), tBMaterialSimpleListItem.getIconPadding(), tBMaterialSimpleListItem.getIconPadding());
                imageView.getBackground().setColorFilter(tBMaterialSimpleListItem.getBackgroundColor(), PorterDuff.Mode.SRC_ATOP);
            } else {
                imageView.setVisibility(8);
            }
            TextView textView = (TextView) view2.findViewById(16908310);
            textView.setTextColor(this.dialog.getBuilder().getItemColor());
            textView.setText(tBMaterialSimpleListItem.getContent());
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35312b0e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.uikit.extend.component.unify.Dialog.TBDialogAdapter
    public void setDialog(TBMaterialDialog tBMaterialDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1effa7f", new Object[]{this, tBMaterialDialog});
        } else {
            this.dialog = tBMaterialDialog;
        }
    }
}
