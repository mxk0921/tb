package com.taobao.schedule;

import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.s;
import com.taobao.taobao.R;
import tb.la8;
import tb.pxn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ViewProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "elastic.ViewProxy";

    private static void checkTouchListener(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1ead7a0", new Object[]{view});
            return;
        }
        int i = R.id.elastic_schedule_view;
        if (view.getTag(i) == null) {
            view.setOnTouchListener(new b(null));
            view.setTag(i, "true");
        }
    }

    private static boolean hitWhiteList(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1951945b", new Object[]{view})).booleanValue();
        }
        if (pxn.d().h(view.getClass().getName())) {
            return true;
        }
        return false;
    }

    public static void setOnClickListener(View view, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("863a75a9", new Object[]{view, onClickListener});
        } else if (!pxn.d().n() || onClickListener == null || !hitWhiteList(view)) {
            view.setOnClickListener(onClickListener);
        } else {
            view.setOnClickListener(new a(onClickListener));
            checkTouchListener(view);
        }
    }

    public static void setOnKeyListener(View view, View.OnKeyListener onKeyListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c64ec849", new Object[]{view, onKeyListener});
        } else {
            view.setOnKeyListener(onKeyListener);
        }
    }

    public static void setOnLongClickListener(View view, View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27f4b629", new Object[]{view, onLongClickListener});
        } else {
            view.setOnLongClickListener(onLongClickListener);
        }
    }

    public static void setOnTouchListener(View view, View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ae34389", new Object[]{view, onTouchListener});
        } else if (!pxn.d().n() || onTouchListener == null || !hitWhiteList(view)) {
            view.setOnTouchListener(onTouchListener);
        } else {
            view.setOnTouchListener(new b(onTouchListener));
            view.setTag(R.id.elastic_schedule_view, "true");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final View.OnTouchListener f11527a;
        public float b = -1.0f;
        public float c = -1.0f;

        public b(View.OnTouchListener onTouchListener) {
            this.f11527a = onTouchListener;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            a(view, motionEvent);
            View.OnTouchListener onTouchListener = this.f11527a;
            if (onTouchListener != null) {
                return onTouchListener.onTouch(view, motionEvent);
            }
            return false;
        }

        public final void a(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a4465cb", new Object[]{this, view, motionEvent});
                return;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                ElasticTriggerCenter.e().g(view, s.SCENE);
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
            } else if (action == 3) {
                ElasticTriggerCenter.e().g(view, "touch_cancel");
                this.b = -1.0f;
                this.c = -1.0f;
            } else if (action == 1) {
                if (!view.isPressed()) {
                    float x = motionEvent.getX() - this.b;
                    float y = motionEvent.getY() - this.c;
                    if (x >= 8.0f || x <= -8.0f || y >= 8.0f || y <= -8.0f) {
                        ElasticTriggerCenter.e().g(view, "touch_cancel");
                    }
                }
                this.b = -1.0f;
                this.c = -1.0f;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final View.OnClickListener f11526a;

        public a(View.OnClickListener onClickListener) {
            this.f11526a = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            la8.d(ViewProxy.TAG, "[OnKeyListenerProxy]onClick", "view", view);
            ElasticTriggerCenter.e().g(view, "click");
            View.OnClickListener onClickListener = this.f11526a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }
}
