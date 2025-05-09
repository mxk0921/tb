package com.taobao.uikit.gesture.controller;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.uikit.gesture.GestureLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.obk;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class SwitchManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EMPTY_GESTURE_BLACK_LIST_STRING = "";
    private static final String KEY_GESTURE_BLACK_LIST = "gesture_black_list";
    private static final String KEY_IS_GESTURE_SWITCH_ON = "is_gesture_switch_on";
    private static final String SP_NAME = "uikit_gesture";
    private static final String TAG = "SwitcherManager";
    private final List<GestureConfig> mBlackList = new ArrayList();
    private final List<IConfigChangeListener> mConfigChangeListeners = new ArrayList();
    private SharedPreferences mSharedPreferences;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class GestureConfig {
        public String activityName;
        public int gestureTypes;
        public String url;

        static {
            t2o.a(933232664);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface IConfigChangeListener {
        void onBlackListChange(List<GestureConfig> list);
    }

    static {
        t2o.a(933232662);
    }

    public static /* synthetic */ SharedPreferences access$000(SwitchManager switchManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("bd3e9952", new Object[]{switchManager});
        }
        return switchManager.mSharedPreferences;
    }

    public static /* synthetic */ void access$100(SwitchManager switchManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84457f1d", new Object[]{switchManager});
        } else {
            switchManager.updateBlackList();
        }
    }

    private void parseBlackList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2716e2db", new Object[]{this, str});
        } else if (str != null && !str.isEmpty()) {
            try {
                List parseArray = JSON.parseArray(str, GestureConfig.class);
                if (parseArray != null && !parseArray.isEmpty()) {
                    this.mBlackList.clear();
                    this.mBlackList.addAll(parseArray);
                }
            } catch (Throwable unused) {
                GestureLog.loge(TAG, "parseBlackList, parse failed. blackList:".concat(str));
            }
        }
    }

    private void updateBlackList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99d80fb", new Object[]{this});
            return;
        }
        parseBlackList(this.mSharedPreferences.getString(KEY_GESTURE_BLACK_LIST, ""));
        for (IConfigChangeListener iConfigChangeListener : this.mConfigChangeListeners) {
            iConfigChangeListener.onBlackListChange(this.mBlackList);
        }
    }

    public void addConfigChangeListener(IConfigChangeListener iConfigChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c09e49c", new Object[]{this, iConfigChangeListener});
        } else if (iConfigChangeListener == null) {
            GestureLog.loge(TAG, "addConfigChangeListener, add failed. listener is null");
        } else {
            this.mConfigChangeListeners.add(iConfigChangeListener);
            if (!this.mBlackList.isEmpty()) {
                iConfigChangeListener.onBlackListChange(this.mBlackList);
            }
        }
    }

    public void removeConfigChangeListener(IConfigChangeListener iConfigChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e94c519", new Object[]{this, iConfigChangeListener});
        } else {
            this.mConfigChangeListeners.remove(iConfigChangeListener);
        }
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mSharedPreferences = context.getSharedPreferences(SP_NAME, 0);
        updateBlackList();
        OrangeConfig.getInstance().registerListener(new String[]{SP_NAME}, new obk() { // from class: com.taobao.uikit.gesture.controller.SwitchManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.obk
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                } else if (!SwitchManager.SP_NAME.equals(str)) {
                    GestureLog.loge(SwitchManager.TAG, "onConfigUpdate, update failed. s:" + str);
                } else {
                    SwitchManager.access$000(SwitchManager.this).edit().putBoolean(SwitchManager.KEY_IS_GESTURE_SWITCH_ON, Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(SwitchManager.SP_NAME, SwitchManager.KEY_IS_GESTURE_SWITCH_ON, "false"))).putString(SwitchManager.KEY_GESTURE_BLACK_LIST, OrangeConfig.getInstance().getConfig(SwitchManager.SP_NAME, SwitchManager.KEY_GESTURE_BLACK_LIST, "")).commit();
                    GestureLog.loge(SwitchManager.TAG, "onConfigUpdate, update success. s:" + str);
                    SwitchManager.access$100(SwitchManager.this);
                }
            }
        }, false);
    }

    public boolean isGestureSwitchOn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4efbc99d", new Object[]{this})).booleanValue();
        }
        return this.mSharedPreferences.getBoolean(KEY_IS_GESTURE_SWITCH_ON, false);
    }
}
