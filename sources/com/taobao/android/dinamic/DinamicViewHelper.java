package com.taobao.android.dinamic;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.constructor.DCheckBoxConstructor;
import com.taobao.android.dinamic.constructor.DCountDownTimerConstructor;
import com.taobao.android.dinamic.constructor.DFrameLayoutConstructor;
import com.taobao.android.dinamic.constructor.DHorizontalScrollLayoutConstructor;
import com.taobao.android.dinamic.constructor.DImageViewConstructor;
import com.taobao.android.dinamic.constructor.DLinearLayoutConstructor;
import com.taobao.android.dinamic.constructor.DLoopLinearLayoutConstructor;
import com.taobao.android.dinamic.constructor.DSwitchConstructor;
import com.taobao.android.dinamic.constructor.DTextInputConstructor;
import com.taobao.android.dinamic.constructor.DTextViewConstructor;
import com.taobao.android.dinamic.exception.DinamicException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.bv;
import tb.nm7;
import tb.sn7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DinamicViewHelper implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, sn7> viewConstructors = new HashMap();
    private static Map<String, bv> eventHandlers = new HashMap();

    static {
        t2o.a(444596239);
        viewConstructors.put("DView", new sn7());
        viewConstructors.put("DTextView", new DTextViewConstructor());
        viewConstructors.put("DImageView", new DImageViewConstructor());
        viewConstructors.put("DFrameLayout", new DFrameLayoutConstructor());
        viewConstructors.put("DLinearLayout", new DLinearLayoutConstructor());
        viewConstructors.put("DHorizontalScrollLayout", new DHorizontalScrollLayoutConstructor());
        viewConstructors.put("DCountDownTimerView", new DCountDownTimerConstructor());
        viewConstructors.put("DLoopLinearLayout", new DLoopLinearLayoutConstructor());
        viewConstructors.put("DTextInput", new DTextInputConstructor());
        viewConstructors.put("DCheckBox", new DCheckBoxConstructor());
        viewConstructors.put("DSwitch", new DSwitchConstructor());
    }

    public static nm7 getEventHandler(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nm7) ipChange.ipc$dispatch("dd4aa362", new Object[]{str});
        }
        return eventHandlers.get(str);
    }

    public static sn7 getViewConstructor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sn7) ipChange.ipc$dispatch("e429334a", new Object[]{str});
        }
        return viewConstructors.get(str);
    }

    public static void registerEventHandler(String str, bv bvVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b74527d", new Object[]{str, bvVar});
        } else if (TextUtils.isEmpty(str) || bvVar == null) {
            throw new DinamicException("registerEventHandler failed, eventIdentify or handler is null");
        } else if (eventHandlers.get(str) == null) {
            eventHandlers.put(str, bvVar);
        } else {
            throw new DinamicException("registerEventHandler failed, eventHander already register by current identify:" + str);
        }
    }

    public static void registerReplaceEventHandler(String str, bv bvVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a47bf14f", new Object[]{str, bvVar});
        } else if (TextUtils.isEmpty(str) || bvVar == null) {
            throw new DinamicException("registerEventHandler failed, eventIdentify or handler is null");
        } else {
            eventHandlers.put(str, bvVar);
        }
    }

    public static void registerReplaceViewConstructor(String str, sn7 sn7Var) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f19abb5", new Object[]{str, sn7Var});
        } else if (TextUtils.isEmpty(str) || sn7Var == null) {
            throw new DinamicException("viewIdentify or assistant is null");
        } else {
            viewConstructors.put(str, sn7Var);
        }
    }

    public static void registerViewConstructor(String str, sn7 sn7Var) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb661c7", new Object[]{str, sn7Var});
        } else if (TextUtils.isEmpty(str) || sn7Var == null) {
            throw new DinamicException("viewIdentify or assistant is null");
        } else if (viewConstructors.get(str) == null) {
            viewConstructors.put(str, sn7Var);
        } else {
            throw new DinamicException("assistant already registed by current identify:" + str);
        }
    }
}
