package com.taobao.android.litecreator.base.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.widget.LCTabView;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a extends LCTabView.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public CheckedTextView d;

    static {
        t2o.a(511705145);
    }

    public a(int i, String str) {
        super(i, str);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/base/widget/LCAlbumTabItem");
    }

    @Override // com.taobao.android.litecreator.base.widget.LCTabView.b
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("faf2c689", new Object[]{this, viewGroup});
        }
        CheckedTextView checkedTextView = (CheckedTextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lay_lc_mediapick_tab_item, viewGroup, false);
        this.d = checkedTextView;
        checkedTextView.setText(this.b);
        return this.d;
    }

    @Override // com.taobao.android.litecreator.base.widget.LCTabView.b
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a838c1", new Object[]{this, new Boolean(z)});
        } else {
            this.d.setChecked(z);
        }
    }
}
