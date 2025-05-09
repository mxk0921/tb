package tb;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tkn implements tzu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f28772a = 0;
    public static final tkn b = new tkn();

    static {
        t2o.a(962593298);
        t2o.a(962593305);
    }

    public static tkn getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tkn) ipChange.ipc$dispatch("5223e693", new Object[0]);
        }
        return b;
    }

    public final void a(Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28419e9", new Object[]{this, map, new Boolean(z)});
            return;
        }
        try {
            SharedPreferences.Editor edit = wu3.c().b().getSharedPreferences("UTRealTimeDebug", 0).edit();
            if (map == null || !z) {
                edit.putLong("debug_date", 0L);
            } else {
                edit.putString("debug_api_url", map.get("debug_api_url"));
                edit.putString("debug_key", map.get("debug_key"));
                edit.putLong("debug_date", System.currentTimeMillis());
            }
            edit.commit();
        } catch (Exception unused) {
        }
    }

    @Override // tb.tzu
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        }
    }

    @Override // tb.tzu
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        } else {
            f28772a--;
        }
    }

    @Override // tb.tzu
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        } else {
            f28772a++;
        }
    }

    @Override // tb.tzu
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // tb.tzu
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // tb.tzu
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    @Override // tb.tzu
    public void onSwitchBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74060788", new Object[]{this});
        }
    }

    @Override // tb.tzu
    public void onSwitchForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb4091d", new Object[]{this});
        }
    }

    @Override // tb.tzu
    public void onActivityCreated(Activity activity, Bundle bundle) {
        String scheme;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        } else if (f28772a == 0) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null && (scheme = data.getScheme()) != null && scheme.startsWith("ut.")) {
                    nhh.v("RealtimeDebugSwitch", "scheme", scheme);
                    String queryParameter = data.getQueryParameter("debugkey");
                    String queryParameter2 = data.getQueryParameter("from");
                    if (scheme.startsWith("ut.")) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("debug_api_url", "https://muvp.alibaba-inc.com/online/UploadRecords.do");
                        if (queryParameter == null) {
                            hashMap.put("debug_key", "");
                        } else {
                            hashMap.put("debug_key", queryParameter);
                        }
                        if (queryParameter2 == null) {
                            hashMap.put("from", "");
                        } else {
                            hashMap.put("from", queryParameter2);
                        }
                        if (!TextUtils.isEmpty(data.getQueryParameter("store"))) {
                            a(hashMap, true);
                            hashMap.put("debug_store", "true");
                        } else {
                            a(hashMap, false);
                        }
                        hashMap.put("debug_sampling_option", "true");
                        g3v.getInstance().turnOnRealTimeDebug(hashMap);
                        return;
                    }
                    return;
                }
                return;
            }
            nhh.v("RealtimeDebugSwitch", bmv.MSGTYPE_INTERVAL, Integer.valueOf(f28772a));
        }
    }
}
