package androidx.core.app;

import android.app.GrammaticalInflectionManager;
import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class GrammaticalInflectionManagerCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int GRAMMATICAL_GENDER_FEMININE = 2;
    public static final int GRAMMATICAL_GENDER_MASCULINE = 3;
    public static final int GRAMMATICAL_GENDER_NEUTRAL = 1;
    public static final int GRAMMATICAL_GENDER_NOT_SPECIFIED = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api34Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api34Impl() {
        }

        public static int getApplicationGrammaticalGender(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("337d33df", new Object[]{context})).intValue();
            }
            return getGrammaticalInflectionManager(context).getApplicationGrammaticalGender();
        }

        private static GrammaticalInflectionManager getGrammaticalInflectionManager(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GrammaticalInflectionManager) ipChange.ipc$dispatch("188d5e8c", new Object[]{context});
            }
            return (GrammaticalInflectionManager) context.getSystemService(GrammaticalInflectionManager.class);
        }

        public static void setRequestedApplicationGrammaticalGender(Context context, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58d5deed", new Object[]{context, new Integer(i)});
            } else {
                getGrammaticalInflectionManager(context).setRequestedApplicationGrammaticalGender(i);
            }
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface GrammaticalGender {
    }

    private GrammaticalInflectionManagerCompat() {
    }

    public static int getApplicationGrammaticalGender(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("337d33df", new Object[]{context})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getApplicationGrammaticalGender(context);
        }
        return 0;
    }

    public static void setRequestedApplicationGrammaticalGender(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58d5deed", new Object[]{context, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.setRequestedApplicationGrammaticalGender(context, i);
        }
    }
}
