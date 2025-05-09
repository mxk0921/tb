package com.taobao.passivelocation;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.orange.OrangeConfig;
import com.taobao.passivelocation.features.power.PowerStateChangedReceiver;
import com.taobao.runtimepermission.a;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import tb.c21;
import tb.etl;
import tb.ich;
import tb.mdh;
import tb.oy4;
import tb.p78;
import tb.qzl;
import tb.t2o;
import tb.u11;
import tb.u5a;
import tb.unr;
import tb.yah;
import tb.z8l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PassiveLocationApplication {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String LOG = "lbs_application";
    private static long timestamp = 0;
    private final long LOCATION_TIME_THRESHOLD = 300000;
    private String SP_KEY = "isOpenPermissionCheckWhenLaunch";

    public static /* synthetic */ String access$000(PassiveLocationApplication passiveLocationApplication) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5487390", new Object[]{passiveLocationApplication});
        }
        return passiveLocationApplication.SP_KEY;
    }

    public static /* synthetic */ long access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1bc42ac", new Object[0])).longValue();
        }
        return timestamp;
    }

    public static /* synthetic */ long access$102(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49363c3e", new Object[]{new Long(j)})).longValue();
        }
        timestamp = j;
        return j;
    }

    public static /* synthetic */ String access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("682607c7", new Object[0]);
        }
        return LOG;
    }

    private void popPassiveLocationGuideDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc08a900", new Object[]{this});
            return;
        }
        try {
            startPassiveLocationService();
        } catch (Exception unused) {
        }
    }

    private void registerApmNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc33a2b", new Object[]{this});
        } else {
            c21.c(new u11() { // from class: com.taobao.passivelocation.PassiveLocationApplication.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.u11, com.taobao.application.common.IApmEventListener
                public void onEvent(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                        return;
                    }
                    try {
                        if (i == 1) {
                            if (!ich.f) {
                                ich.f = true;
                                yah.b = System.currentTimeMillis();
                                if (new ich(yah.f31937a).c()) {
                                    u5a u5aVar = new u5a();
                                    u5aVar.b(yah.f31937a);
                                    u5aVar.a(yah.f31937a, true);
                                }
                            }
                        } else if (i != 2) {
                        } else {
                            if (ich.f) {
                                ich.f = false;
                                yah.b = System.currentTimeMillis();
                                new ich(yah.f31937a);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private void registerPowerStateChangedReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47588dbb", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_BATTERY_LOW");
        intentFilter.addAction("android.intent.action.ACTION_BATTERY_OKAY");
        yah.f31937a.registerReceiver(new PowerStateChangedReceiver(), intentFilter);
    }

    private void startPassiveLocationService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a07e922", new Object[]{this});
            return;
        }
        registerPowerStateChangedReceiver();
        registerApmNotify();
    }

    public boolean isCheckPermission(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a53e1d8", new Object[]{this, context})).booleanValue();
        }
        try {
            return context.getSharedPreferences(etl.SP_NAME, 0).getBoolean(this.SP_KEY, true);
        } catch (Throwable unused) {
            return true;
        }
    }

    public void onCreate(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce26ae5d", new Object[]{this, application});
        } else if (application != null) {
            new TaoApplication().onCreate(application);
            registerReceivers();
        }
    }

    public void savePermissionCheckState(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e23de3e", new Object[]{this, context, str, new Boolean(z)});
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(etl.SP_NAME, 0).edit();
            edit.putBoolean(str, z);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    private void registerReceivers() {
        qzl d;
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97332908", new Object[]{this});
            return;
        }
        String str = LOG;
        mdh.d(str, "device & os version：pid=" + Process.myPid() + ";product_model=" + Build.MODEL + ",sdk_version=" + Build.VERSION.SDK_INT + ",release=" + Build.VERSION.RELEASE);
        String processName = TaoApplication.getProcessName(yah.f31937a);
        if (processName == null || !"com.taobao.taobao".equals(processName)) {
            mdh.d(LOG, "**********not taobao main process into**********");
            return;
        }
        mdh.d(LOG, "**********LBS module create**********");
        popPassiveLocationGuideDialog();
        boolean isCheckPermission = isCheckPermission(yah.f31937a);
        savePermissionCheckState(yah.f31937a, this.SP_KEY, "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("tblocationcommon", "isOpenLaunchPermissionCheck", "true")));
        OrangeConfig.getInstance().registerListener(new String[]{"tblocationcommon"}, new z8l() { // from class: com.taobao.passivelocation.PassiveLocationApplication.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.z8l
            public void onConfigUpdate(String str2, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str2, new Boolean(z)});
                } else if ("tblocationcommon".equalsIgnoreCase(str2)) {
                    PassiveLocationApplication passiveLocationApplication = PassiveLocationApplication.this;
                    passiveLocationApplication.savePermissionCheckState(yah.f31937a, PassiveLocationApplication.access$000(passiveLocationApplication), "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("tblocationcommon", "isOpenLaunchPermissionCheck", "true")));
                }
            }
        });
        if (!isCheckPermission || (d = a.d(yah.f31937a, "TB_SHOPPING_PROCESS", new String[]{p78.ACCESS_FINE_LOCATION})) == null || (iArr = d.b) == null || iArr.length <= 0 || iArr[0] == 0) {
            Context context = yah.f31937a;
            if (context instanceof PanguApplication) {
                ((PanguApplication) context).registerCrossActivityLifecycleCallback(new oy4() { // from class: com.taobao.passivelocation.PassiveLocationApplication.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str2, Object... objArr) {
                        str2.hashCode();
                        int hashCode = str2.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/passivelocation/PassiveLocationApplication$2");
                    }

                    @Override // tb.oy4, com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
                    public void onStarted(Activity activity) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4b167bb", new Object[]{this, activity});
                            return;
                        }
                        try {
                            if (System.currentTimeMillis() - PassiveLocationApplication.access$100() < 300000) {
                                mdh.a(PassiveLocationApplication.access$200(), "front so frequently！ ignore");
                                return;
                            }
                            PassiveLocationApplication.access$102(System.currentTimeMillis());
                            TBLocationClient g = TBLocationClient.g(Globals.getApplication());
                            TBLocationOption tBLocationOption = new TBLocationOption();
                            tBLocationOption.setDataModel(TBLocationOption.DataModel.NEED_ADDRESS);
                            tBLocationOption.setTimeLimit(TBLocationOption.TimeLimit.NO_CACHE);
                            tBLocationOption.setAccuracy(TBLocationOption.Accuracy.HEKTOMETER);
                            g.h(tBLocationOption, new unr() { // from class: com.taobao.passivelocation.PassiveLocationApplication.2.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // tb.unr
                                public void onLocationChanged(TBLocationDTO tBLocationDTO) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
                                        return;
                                    }
                                    try {
                                        String access$200 = PassiveLocationApplication.access$200();
                                        mdh.d(access$200, "切前台-位置信息：" + JSON.toJSONString(tBLocationDTO));
                                    } catch (Exception e) {
                                        mdh.c(PassiveLocationApplication.access$200(), "切前台-回调处理异常", e);
                                    }
                                }
                            }, Looper.getMainLooper());
                        } catch (Exception unused) {
                        }
                    }

                    @Override // tb.oy4, com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
                    public void onStopped(Activity activity) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("82d37207", new Object[]{this, activity});
                        }
                    }
                });
                return;
            }
            return;
        }
        mdh.a(LOG, "不允许该场景请求定位");
    }

    static {
        t2o.a(789577822);
    }
}
