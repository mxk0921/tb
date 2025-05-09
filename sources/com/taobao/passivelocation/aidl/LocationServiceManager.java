package com.taobao.passivelocation.aidl;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.WeakHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LocationServiceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG = "LocationServiceManager";
    public static final String NAVI_RESULT = "lbs_location_navi_result";
    public static LocationDTO sLocationDTO = null;
    private static WeakHashMap<Context, LocationServiceManager> instances = new WeakHashMap<>();

    static {
        t2o.a(756023336);
    }

    private LocationServiceManager(Context context) {
    }

    public static LocationDTO getCachedLocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationDTO) ipChange.ipc$dispatch("80113c54", new Object[0]);
        }
        try {
            if (sLocationDTO != null) {
                new StringBuilder("从内存缓存获取数据：").append(JSON.toJSONString(sLocationDTO));
                return sLocationDTO;
            }
            String string = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getString(NAVI_RESULT, "");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            LocationDTO locationDTO = (LocationDTO) JSON.parseObject(string, LocationDTO.class);
            sLocationDTO = locationDTO;
            new StringBuilder("从文件缓存获取数据").append(JSON.toJSONString(sLocationDTO));
            return locationDTO;
        } catch (Exception unused) {
            return null;
        }
    }

    public static LocationServiceManager newInstance(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LocationServiceManager) ipChange.ipc$dispatch("4ed492f3", new Object[]{context}) : new LocationServiceManager(context);
    }

    public static LocationServiceManager sharedInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationServiceManager) ipChange.ipc$dispatch("d20ec438", new Object[]{context});
        }
        LocationServiceManager locationServiceManager = instances.get(context);
        if (locationServiceManager != null) {
            return locationServiceManager;
        }
        LocationServiceManager locationServiceManager2 = new LocationServiceManager(context);
        instances.put(context, locationServiceManager2);
        return locationServiceManager2;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    @Deprecated
    public LocationDTO getCurrentCity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationDTO) ipChange.ipc$dispatch("b24e73b5", new Object[]{this});
        }
        return null;
    }

    public LocationDTO getCurrentLocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationDTO) ipChange.ipc$dispatch("3298547f", new Object[]{this});
        }
        return null;
    }

    @Deprecated
    public LocationDTO getLastSuccessNavLocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationDTO) ipChange.ipc$dispatch("885c7288", new Object[]{this});
        }
        return null;
    }

    public LocationDTO getNavigationResultFromFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationDTO) ipChange.ipc$dispatch("51097c94", new Object[]{this});
        }
        return null;
    }

    public LocationDTO getNavigationResultFromMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationDTO) ipChange.ipc$dispatch("2c9cddd9", new Object[]{this});
        }
        return null;
    }

    public LocationDTO getSwitchedCity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationDTO) ipChange.ipc$dispatch("6f1b27bb", new Object[]{this});
        }
        return null;
    }

    @Deprecated
    public boolean ismInitResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8551e6bb", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void queryCityList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d09998", new Object[]{this});
        }
    }

    public void startCustomizableNavigation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3d6b7b", new Object[]{this, new Boolean(z)});
        }
    }

    public void startNavigation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec9a19d", new Object[]{this});
        }
    }

    public void startPassiveLocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5d016c1", new Object[]{this});
        }
    }

    public boolean startPassiveLocationGuide(LocationServiceCallback locationServiceCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6b4fbd0", new Object[]{this, locationServiceCallback})).booleanValue();
        }
        try {
            locationServiceCallback.onLocationDialogResult(true);
        } catch (Exception e) {
            new StringBuilder("an error occurs: ").append(e.getMessage());
        }
        return false;
    }

    public void switchCity(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef6b31ee", new Object[]{this, str, str2, str3, str4});
        }
    }

    @Deprecated
    public static LocationServiceManager newInstance(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LocationServiceManager) ipChange.ipc$dispatch("89a614f7", new Object[]{context, new Boolean(z)}) : new LocationServiceManager(context);
    }
}
