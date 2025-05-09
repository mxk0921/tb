package com.taobao.weex.common;

import android.content.Intent;
import android.text.TextUtils;
import android.view.Menu;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bww;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class WXModule implements IWXObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_ACTIVITY_RESULT = "actionActivityResult";
    public static final String ACTION_REQUEST_PERMISSIONS_RESULT = "actionRequestPermissionsResult";
    public static final String GRANT_RESULTS = "grantResults";
    public static final String PERMISSIONS = "permissions";
    public static final String REQUEST_CODE = "requestCode";
    public static final String RESULT_CODE = "resultCode";
    private Map<String, List<String>> mEvents = new HashMap();
    private Map<String, Boolean> mKeepAlives = new HashMap();
    private String mModuleName;
    public WXSDKInstance mWXSDKInstance;

    static {
        t2o.a(985661575);
        t2o.a(985661562);
    }

    public List<String> getEventCallbacks(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6003998c", new Object[]{this, str});
        }
        return this.mEvents.get(str);
    }

    public String getModuleName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8cdd20c", new Object[]{this});
        }
        return this.mModuleName;
    }

    public boolean isOnce(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74ff3b20", new Object[]{this, str})).booleanValue();
        }
        return this.mKeepAlives.get(str).booleanValue();
    }

    public void onActivityCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f208031", new Object[]{this});
        }
    }

    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
        }
    }

    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        }
    }

    public void onActivityStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
        }
    }

    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        return false;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
        }
    }

    @JSMethod
    public void removeAllEventListeners(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f839b3", new Object[]{this, str});
        } else if (this.mEvents.containsKey(str)) {
            for (String str2 : this.mEvents.remove(str)) {
                this.mKeepAlives.remove(str2);
            }
        }
    }

    public void setModuleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d5f6ea", new Object[]{this, str});
        } else {
            this.mModuleName = str;
        }
    }

    public boolean onActivityBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbe14a20", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @JSMethod
    public void addEventListener(String str, String str2, Map<String, Object> map) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf5a071d", new Object[]{this, str, str2, map});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (map == null || map.size() <= 0 || !map.containsKey("once") || !bww.c(map.get("once"), Boolean.FALSE).booleanValue()) {
                z = false;
            }
            this.mKeepAlives.put(str2, Boolean.valueOf(z));
            if (this.mEvents.get(str) == null) {
                this.mEvents.put(str, new ArrayList());
            }
            this.mEvents.get(str).add(str2);
        }
    }
}
