package com.taobao.falco;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.WindowHookManager;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class y implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Window.Callback f10501a;
    public final a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
    }

    public y(Window.Callback callback, a aVar) {
        this.f10501a = callback;
        this.b = aVar;
    }

    public final float a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("239c87b", new Object[]{this, motionEvent})).floatValue();
        }
        try {
            return motionEvent.getX();
        } catch (IllegalArgumentException unused) {
            return -1.0f;
        }
    }

    public final float b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("172290bc", new Object[]{this, motionEvent})).floatValue();
        }
        try {
            return motionEvent.getY();
        } catch (IllegalArgumentException unused) {
            return -1.0f;
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String name = method.getName();
        boolean equals = "dispatchTouchEvent".equals(name);
        a aVar = this.b;
        if (equals) {
            if (objArr != null && objArr.length >= 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof MotionEvent) {
                    MotionEvent motionEvent = (MotionEvent) obj2;
                    int action = motionEvent.getAction();
                    float a2 = a(motionEvent);
                    float b = b(motionEvent);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (a2 > 0.0f && b > 0.0f) {
                        ((WindowHookManager.b) aVar).b(action, a2, b, currentTimeMillis);
                    }
                }
            }
        } else if ("dispatchKeyEvent".equals(name) && objArr != null && objArr.length >= 1) {
            Object obj3 = objArr[0];
            if (obj3 instanceof KeyEvent) {
                ((WindowHookManager.b) aVar).a((KeyEvent) obj3);
            }
        }
        try {
            return method.invoke(this.f10501a, objArr);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        }
    }
}
