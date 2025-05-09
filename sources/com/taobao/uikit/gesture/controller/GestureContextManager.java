package com.taobao.uikit.gesture.controller;

import android.app.Activity;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.gesture.model.GestureContext;
import java.util.Iterator;
import java.util.Stack;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GestureContextManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Stack<GestureContext> mGestureContextStack = new Stack<>();

    static {
        t2o.a(933232650);
    }

    public GestureContext getGestureContext(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GestureContext) ipChange.ipc$dispatch("a97d9454", new Object[]{this, activity});
        }
        if (this.mGestureContextStack.isEmpty()) {
            return null;
        }
        Iterator<GestureContext> it = this.mGestureContextStack.iterator();
        while (it.hasNext()) {
            GestureContext next = it.next();
            if (next.getActivity() == activity) {
                return next;
            }
        }
        return null;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        } else {
            this.mGestureContextStack.push(new GestureContext(activity));
        }
    }

    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        } else if (!this.mGestureContextStack.isEmpty()) {
            this.mGestureContextStack.pop();
        }
    }
}
