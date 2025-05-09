package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class lno {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final lno INSTANCE = new lno();

    static {
        t2o.a(133169196);
    }

    public final void a(Context context) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ff77015", new Object[]{this, context});
        } else if (context != null && (sharedPreferences = context.getSharedPreferences("mega_speech_recognizer", 0)) != null && (edit = sharedPreferences.edit()) != null) {
            edit.clear();
            edit.apply();
        }
    }

    public final Long b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("f489c8b5", new Object[]{this, context});
        }
        if (context != null) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("mega_speech_recognizer", 0);
                if (sharedPreferences != null) {
                    Long valueOf = Long.valueOf(sharedPreferences.getLong("expire_time_stamp", 0L));
                    if (valueOf.longValue() != 0) {
                        return valueOf;
                    }
                    return null;
                }
            } catch (Exception e) {
                iih.INSTANCE.a("SpeechRecognizer_SPUtil", sm8.b(e));
            }
        }
        return null;
    }

    public final String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4001c0a2", new Object[]{this, context});
        }
        if (context != null) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("mega_speech_recognizer", 0);
                if (sharedPreferences != null) {
                    return sharedPreferences.getString("token", null);
                }
            } catch (Exception e) {
                iih.INSTANCE.a("SpeechRecognizer_SPUtil", sm8.b(e));
            }
        }
        return null;
    }

    public final void d(Context context, long j) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d4334b", new Object[]{this, context, new Long(j)});
        } else if (context != null && (sharedPreferences = context.getSharedPreferences("mega_speech_recognizer", 0)) != null && (edit = sharedPreferences.edit()) != null) {
            edit.putLong("expire_time_stamp", j);
            edit.apply();
        }
    }

    public final void e(Context context, String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa5c741", new Object[]{this, context, str});
            return;
        }
        ckf.g(str, "token");
        if (context != null && (sharedPreferences = context.getSharedPreferences("mega_speech_recognizer", 0)) != null && (edit = sharedPreferences.edit()) != null) {
            edit.putString("token", str);
            edit.apply();
        }
    }
}
