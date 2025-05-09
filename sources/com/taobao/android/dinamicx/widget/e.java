package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeTextView;
import tb.je5;
import tb.qub;
import tb.sk6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e extends je5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_WIDGET_X_ICON_FONT_VIEW = -4224482009255257824L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new e((Context) obj);
        }
    }

    public e(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        if (str.hashCode() == -303753557) {
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXButterIconWidgetNode");
    }

    @Override // tb.je5, tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new e((Context) obj);
    }

    @Override // tb.je5, tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        Typeface a2 = sk6.a(context);
        if (a2 != null) {
            ((DXNativeTextView) view).setTypeface(a2);
        }
        ((DXNativeTextView) view).setIncludeFontPadding(false);
    }
}
