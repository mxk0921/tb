package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.global.SwitchConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class biv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f16417a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final biv f16418a = new biv();

        static {
            t2o.a(589299808);
        }

        public static /* synthetic */ biv a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (biv) ipChange.ipc$dispatch("ba5da6f6", new Object[0]);
            }
            return f16418a;
        }
    }

    static {
        t2o.a(589299806);
    }

    public static biv a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (biv) ipChange.ipc$dispatch("c4b743dc", new Object[0]);
        }
        return b.a();
    }

    public String b(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ebae6f5", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && this.f16417a != null) {
            long unitCalibrationTTL = SwitchConfig.getInstance().getUnitCalibrationTTL();
            if (unitCalibrationTTL <= 0) {
                return null;
            }
            String string = this.f16417a.getString(str, null);
            if (!TextUtils.isEmpty(string) && (split = string.split(",")) != null && split.length == 2) {
                String str2 = split[0];
                if (System.currentTimeMillis() < Long.parseLong(split[1]) + unitCalibrationTTL) {
                    return str2;
                }
                this.f16417a.edit().remove(str).apply();
            }
        }
        return null;
    }

    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67001ef", new Object[]{this, context});
        } else if (context != null) {
            this.f16417a = context.getSharedPreferences("MtopUnitConfig", 0);
        }
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9795be9e", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && this.f16417a != null && SwitchConfig.getInstance().getUnitCalibrationTTL() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences.Editor edit = this.f16417a.edit();
            edit.putString(str, str2 + "," + currentTimeMillis).apply();
        }
    }

    public biv() {
    }
}
