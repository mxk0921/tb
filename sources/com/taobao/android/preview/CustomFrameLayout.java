package com.taobao.android.preview;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CustomFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG = getClass().getName();
    public boolean isConsumed = false;
    public Runnable runnable = new a();
    public float x;
    public float y;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            CustomFrameLayout.this.isConsumed = true;
            try {
                new JSONObject(CustomFrameLayout.this.getContentDescription().toString()).toString(4);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    static {
        t2o.a(444598028);
    }

    public CustomFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(CustomFrameLayout customFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/preview/CustomFrameLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            this.x = motionEvent.getX();
            this.y = motionEvent.getY();
            this.isConsumed = false;
            getHandler().postDelayed(this.runnable, 1500L);
            return super.onInterceptTouchEvent(motionEvent);
        } else if (motionEvent.getAction() == 1) {
            if (this.isConsumed) {
                return true;
            }
            getHandler().removeCallbacks(this.runnable);
            return super.onInterceptTouchEvent(motionEvent);
        } else if (motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.x) > 32.0f && Math.abs(motionEvent.getY() - this.y) > 32.0f && !this.isConsumed) {
            getHandler().removeCallbacks(this.runnable);
            return super.onInterceptTouchEvent(motionEvent);
        } else if (motionEvent.getAction() != 3) {
            return super.onInterceptTouchEvent(motionEvent);
        } else {
            if (this.isConsumed) {
                return true;
            }
            getHandler().removeCallbacks(this.runnable);
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        return super.onTouchEvent(motionEvent);
    }
}
