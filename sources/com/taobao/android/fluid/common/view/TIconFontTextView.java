package com.taobao.android.fluid.common.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.feature.view.TTextView;
import java.util.WeakHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TIconFontTextView extends TTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final WeakHashMap<View, Void> f7752a = new WeakHashMap<>();
        public static Typeface b;

        static {
            t2o.a(468713778);
        }

        public static Typeface a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Typeface) ipChange.ipc$dispatch("78ff04a1", new Object[]{view});
            }
            if (b == null) {
                try {
                    b = Typeface.createFromAsset(view.getContext().getApplicationContext().getAssets(), "uik_iconfont.ttf");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            f7752a.put(view, null);
            return b;
        }

        public static void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f077a4", new Object[]{view});
                return;
            }
            WeakHashMap<View, Void> weakHashMap = f7752a;
            weakHashMap.remove(view);
            if (weakHashMap.size() == 0) {
                b = null;
            }
        }
    }

    static {
        t2o.a(468713777);
    }

    public TIconFontTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static /* synthetic */ Object ipc$super(TIconFontTextView tIconFontTextView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/common/view/TIconFontTextView");
        }
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("3161bb0a", new Object[]{this});
        }
        return a.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        setTypeface(a.a(this));
        setIncludeFontPadding(false);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        setTypeface(null);
        a.b(this);
        super.onDetachedFromWindow();
    }

    public TIconFontTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TIconFontTextView(Context context) {
        super(context);
    }
}
