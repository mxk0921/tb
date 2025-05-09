package com.taobao.tao.flexbox.layoutmanager.component;

import android.graphics.Color;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView;
import tb.nwv;
import tb.t2o;
import tb.xkt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface d {
    public static final int placeHolder = Color.argb(255, 232, 232, 232);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements SpanWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public View f12145a;
        public xkt b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tao.flexbox.layoutmanager.component.d$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0686a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Spannable f12146a;

            public RunnableC0686a(Spannable spannable) {
                this.f12146a = spannable;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.a(a.this, this.f12146a);
                }
            }
        }

        static {
            t2o.a(503316803);
        }

        public static /* synthetic */ void a(a aVar, Spannable spannable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f78669e", new Object[]{aVar, spannable});
            } else {
                aVar.b(spannable);
            }
        }

        public final void b(Spannable spannable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d4e2109", new Object[]{this, spannable});
                return;
            }
            View view = this.f12145a;
            if (view == null) {
                xkt xktVar = this.b;
                if (xktVar != null) {
                    xktVar.e(spannable);
                }
            } else if (view instanceof TextView) {
                ((TextView) view).setText(spannable);
            } else if (view instanceof StaticLayoutView) {
                view.invalidate();
            }
        }

        public void c(xkt xktVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8a39e90", new Object[]{this, xktVar});
            } else {
                this.b = xktVar;
            }
        }

        public void d(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d57c5a77", new Object[]{this, view});
            } else {
                this.f12145a = view;
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd069bcd", new Object[]{this, spannable, obj, new Integer(i), new Integer(i2)});
            } else if (obj instanceof ImageSpan) {
                spannable.removeSpan(this);
                if (this.f12145a != null || this.b != null) {
                    if (nwv.X()) {
                        b(spannable);
                    } else {
                        nwv.y0(new RunnableC0686a(spannable));
                    }
                }
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3db47e1", new Object[]{this, spannable, obj, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3491016d", new Object[]{this, spannable, obj, new Integer(i), new Integer(i2)});
            }
        }
    }
}
