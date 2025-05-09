package com.alipay.android.msp.framework.drm;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class ChangeMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CONTENT = "content";
    public static final String KEY_CONTENT_CHANGED = "content_change";
    public JSONObject mMspSwitch;
    public final AtomicInteger contextNum = new AtomicInteger(0);
    public final ArrayList<Pair<String, String>> mMspSwitchChangeCurrent = new ArrayList<>();
    public SharedPreferences pref = null;
    public JSONArray mMspSwitchChangeBack = new JSONArray();

    public final synchronized void a(String str, String str2, boolean z) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        if (!TextUtils.isEmpty(str) && (jSONObject = this.mMspSwitch) != null) {
            jSONObject.put(str, (Object) str2);
            if (z) {
                this.mMspSwitchChangeCurrent.add(new Pair<>(str, str2));
            }
        }
    }

    public synchronized void hitKey(String str, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7261ffb", new Object[]{this, str, obj, new Boolean(z)});
        } else if (this.contextNum.get() > 0 && this.mMspSwitch != null) {
            String obj2 = obj == null ? "null" : obj.toString();
            if (!z && obj2.startsWith("{") && obj2.endsWith("}")) {
                obj2 = String.valueOf(obj2.hashCode());
            }
            if (this.mMspSwitch.containsKey(str)) {
                if (!TextUtils.equals(obj2, this.mMspSwitch.getString(str))) {
                    a(str, obj2, true);
                }
            } else if (obj == null) {
                a(str, obj2, false);
            } else {
                a(str, obj2, true);
            }
        }
    }

    public void newContext(final String str, final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("575fd688", new Object[]{this, str, context});
            return;
        }
        try {
            if (this.contextNum.get() == 0) {
                TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.drm.ChangeMonitor.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ChangeMonitor.this.pref = context.getSharedPreferences(str, 0);
                        SharedPreferences sharedPreferences = ChangeMonitor.this.pref;
                        String string = sharedPreferences != null ? sharedPreferences.getString("content", "{}") : null;
                        if (!TextUtils.isEmpty(string) && ChangeMonitor.this.contextNum.get() != 0) {
                            ChangeMonitor.this.mMspSwitch = JSON.parseObject(string);
                        }
                    }
                });
            }
            this.contextNum.getAndIncrement();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public synchronized Pair<Boolean, JSONArray> exit() {
        boolean z = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("f8882c19", new Object[]{this});
            }
            JSONArray jSONArray = new JSONArray();
            if (this.contextNum.get() <= 0 || this.mMspSwitch == null) {
                if (this.contextNum.get() > 0) {
                    this.contextNum.decrementAndGet();
                }
                return new Pair<>(Boolean.FALSE, jSONArray);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.mMspSwitchChangeCurrent.size());
            LogUtil.record(2, "mMspSwitchChange long", sb.toString());
            int size = this.mMspSwitchChangeCurrent.size();
            for (int i = size - 1; i >= 0 && i > size - 11; i--) {
                JSONObject jSONObject = new JSONObject();
                Pair<String, String> pair = this.mMspSwitchChangeCurrent.get(i);
                if (pair != null) {
                    jSONObject.put(pair.first, (Object) pair.second);
                    jSONArray.add(jSONObject);
                }
            }
            if (jSONArray.size() > 0) {
                z = true;
            }
            if (jSONArray.size() < 10) {
                for (int size2 = this.mMspSwitchChangeBack.size() - 1; size2 >= 0 && jSONArray.size() < 10; size2--) {
                    JSONObject jSONObject2 = new JSONObject();
                    Pair pair2 = (Pair) this.mMspSwitchChangeBack.getObject(size2, Pair.class);
                    if (pair2 != null) {
                        jSONObject2.put(String.valueOf(pair2.first), pair2.second);
                        jSONArray.add(jSONObject2);
                    }
                }
            }
            if (this.contextNum.get() > 0 && this.contextNum.decrementAndGet() <= 0) {
                this.mMspSwitchChangeBack.addAll(this.mMspSwitchChangeCurrent);
                this.mMspSwitchChangeCurrent.clear();
            }
            this.pref.edit().putString("content", this.mMspSwitch.toJSONString()).apply();
            this.pref.edit().putString(KEY_CONTENT_CHANGED, this.mMspSwitchChangeBack.toJSONString()).apply();
            return new Pair<>(Boolean.valueOf(z), jSONArray);
        }
    }

    public void hitKey(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e774d1f9", new Object[]{this, str, obj});
        } else {
            hitKey(str, obj, false);
        }
    }
}
