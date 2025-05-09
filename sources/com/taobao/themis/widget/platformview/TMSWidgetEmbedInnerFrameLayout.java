package com.taobao.themis.widget.platformview;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSWidgetEmbedInnerFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mSizeChangedListener;
    private b mVisibilityChangedListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void onSizeChanged(int i, int i2, int i3, int i4);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void onWindowVisibilityChanged(int i);
    }

    static {
        t2o.a(852492389);
    }

    public TMSWidgetEmbedInnerFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(TMSWidgetEmbedInnerFrameLayout tMSWidgetEmbedInnerFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -461309207) {
            super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/themis/widget/platformview/TMSWidgetEmbedInnerFrameLayout");
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        a aVar = this.mSizeChangedListener;
        if (aVar != null) {
            aVar.onSizeChanged(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        b bVar = this.mVisibilityChangedListener;
        if (bVar != null) {
            bVar.onWindowVisibilityChanged(i);
        }
    }

    public TMSWidgetEmbedInnerFrameLayout whenSizeChanged(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSWidgetEmbedInnerFrameLayout) ipChange.ipc$dispatch("e09943ba", new Object[]{this, aVar});
        }
        this.mSizeChangedListener = aVar;
        return this;
    }

    public TMSWidgetEmbedInnerFrameLayout whenWindowVisibilityChanged(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSWidgetEmbedInnerFrameLayout) ipChange.ipc$dispatch("8665aba", new Object[]{this, bVar});
        }
        this.mVisibilityChangedListener = bVar;
        return this;
    }
}
