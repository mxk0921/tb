package com.alibaba.poplayer.trigger.adapter;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.poplayer.utils.Monitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.rjl;
import tb.t2o;

/* compiled from: Taobao */
@Monitor.TargetClass
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TriggerControllerInfoManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicBoolean IS_COLD_LAUNCH_PAGE_SWITCH = new AtomicBoolean(true);
    public volatile boolean isColdLaunchCreate;
    @Monitor.TargetField(name = rjl.MONITOR_NATIVE_URL)
    private volatile String mCurrentActivityInfo;
    private volatile String mCurrentActivityKeyCode;
    @Monitor.TargetField(name = rjl.MONITOR_PAGE_FRAGMENT)
    private volatile String mCurrentFragmentName;
    private volatile String mCurrentKeyCode;
    @Monitor.TargetField(name = "page")
    private volatile String mCurrentUri;
    private final Map<String, String> mKeyCodeMap = new ConcurrentHashMap();
    private volatile boolean mIsPreActivityFinishing = false;
    private volatile long curPageCreateTime = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final TriggerControllerInfoManager f2535a = new TriggerControllerInfoManager();

        static {
            t2o.a(626000027);
        }

        public static /* synthetic */ TriggerControllerInfoManager a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TriggerControllerInfoManager) ipChange.ipc$dispatch("61839cf8", new Object[0]);
            }
            return f2535a;
        }
    }

    static {
        t2o.a(626000026);
    }

    public static TriggerControllerInfoManager instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TriggerControllerInfoManager) ipChange.ipc$dispatch("d32e7edd", new Object[0]);
        }
        return a.a();
    }

    public void clearKeyCodeMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c76801ce", new Object[]{this, str});
        } else {
            this.mKeyCodeMap.remove(str);
        }
    }

    public String getCurActivityInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("700324d2", new Object[]{this});
        }
        return this.mCurrentActivityInfo;
    }

    public String getCurActivityKeyCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a619666", new Object[]{this});
        }
        return this.mCurrentActivityKeyCode;
    }

    public String getCurFragmentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("483456f4", new Object[]{this});
        }
        return this.mCurrentFragmentName;
    }

    public String getCurKeyCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cddc75b7", new Object[]{this});
        }
        return this.mCurrentKeyCode;
    }

    public long getCurPageSwitchSystemTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e68ecac4", new Object[]{this})).longValue();
        }
        return this.curPageCreateTime;
    }

    public String getCurUri() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1819e37", new Object[]{this});
        }
        return this.mCurrentUri;
    }

    public String getPreFragmentName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82ebd027", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return this.mKeyCodeMap.get(str);
    }

    public boolean isColdLaunchCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac436e8", new Object[]{this})).booleanValue();
        }
        return this.isColdLaunchCreate;
    }

    public boolean isPreActivityFinishing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93338512", new Object[]{this})).booleanValue();
        }
        return this.mIsPreActivityFinishing;
    }

    public void updateCurPageInfo(String str, String str2, String str3, String str4, String str5, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62788807", new Object[]{this, str, str2, str3, str4, str5, new Boolean(z)});
            return;
        }
        this.mCurrentActivityKeyCode = str;
        this.mCurrentFragmentName = str2;
        this.mCurrentKeyCode = str3;
        this.mCurrentUri = str4;
        this.mCurrentActivityInfo = str5;
        this.mIsPreActivityFinishing = z;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.mKeyCodeMap.put(str, str2);
        }
        this.curPageCreateTime = SystemClock.elapsedRealtime();
    }

    public void updateIsPreActivityFinishing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d748fd", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsPreActivityFinishing = z;
        }
    }

    public void onPageSwitched() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d97ab608", new Object[]{this});
        } else {
            this.isColdLaunchCreate = IS_COLD_LAUNCH_PAGE_SWITCH.compareAndSet(true, false);
        }
    }
}
