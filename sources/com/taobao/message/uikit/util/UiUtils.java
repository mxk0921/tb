package com.taobao.message.uikit.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.uikit.drawable.TextDrawable;
import com.taobao.message.uikit.provider.A11yOCRProvider;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;
import tb.zk4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class UiUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String Preference_KeyBoardHeight = "Preference_KeyBoardHeight";
    private static final String TAG = "UiUtils";
    private static long lastClickTime;
    private static Typeface sIconfont;
    public static int DEF_KEYBOARD_HEIGHT = 214;
    private static Map<String, TextDrawable> cacheDrawable = new HashMap();
    private static boolean isInit = false;

    static {
        t2o.a(529531098);
    }

    public static boolean asyncSetImageUrl(TUrlImageView tUrlImageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64ebc275", new Object[]{tUrlImageView, str})).booleanValue();
        }
        return setImageUrl(tUrlImageView, str, true, -1, -1);
    }

    public static void fetchAndSetA11yOCR(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1ec994", new Object[]{view, str});
            return;
        }
        A11yOCRProvider a11yOCRProvider = (A11yOCRProvider) GlobalContainer.getInstance().get(A11yOCRProvider.class);
        if (a11yOCRProvider != null && !TextUtils.isEmpty(str)) {
            a11yOCRProvider.fetchAndSetA11yDescription(str, view);
        }
    }

    public static int getColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("384a2dc2", new Object[]{new Integer(i)})).intValue();
        }
        return ResourcesCompat.getColor(ApplicationUtil.getApplication().getResources(), i, ApplicationUtil.getApplication().getTheme());
    }

    public static Drawable getDrawableResourceByName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("3504e9a5", new Object[]{str});
        }
        try {
            return ContextCompat.getDrawable(ApplicationUtil.getApplication(), getResourceIdentifier(ApplicationUtil.getApplication(), str, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS));
        } catch (Exception unused) {
            return null;
        }
    }

    public static int getKeyBoardHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8cb41f3e", new Object[0])).intValue();
        }
        return SharedPreferencesUtil.getIntSharedPreference("Preference_KeyBoardHeight", DisplayUtil.dip2px(DEF_KEYBOARD_HEIGHT));
    }

    public static int getResourceIdentifier(Context context, String str, String str2, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfe081bf", new Object[]{context, str, str2, new Boolean(z)})).intValue();
        }
        if (!BundleSplitUtil.INSTANCE.isDynamicFeature() || !z) {
            z2 = false;
        }
        Resources resources = context.getResources();
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(z2 ? ".taobao_wangxin" : "");
        return resources.getIdentifier(str, str2, sb.toString());
    }

    public static String getStringResourceById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a75332b", new Object[]{new Integer(i)});
        }
        return ApplicationUtil.getApplication().getString(i);
    }

    public static String getStringResourceByName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("350c5638", new Object[]{str});
        }
        try {
            return ApplicationUtil.getApplication().getString(ApplicationUtil.getApplication().getResources().getIdentifier(str, "string", ApplicationUtil.getApplication().getPackageName()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        if (!isInit) {
            try {
                if (sIconfont == null) {
                    sIconfont = Typeface.createFromAsset(ApplicationUtil.getApplication().getAssets(), "uik_iconfont.ttf");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            cacheDrawable.put("뀫_-669917_18", getIconFont(ApplicationUtil.getApplication(), -669917, 18, "뀫"));
            cacheDrawable.put("\uf45b_-3355444_14", getIconFont(ApplicationUtil.getApplication(), -3355444, 14, "\uf45b"));
            cacheDrawable.put("텫_-678365_16", getIconFont(ApplicationUtil.getApplication(), -678365, 16, "텫"));
        }
        isInit = true;
    }

    public static boolean isFastDoubleClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57bf07bc", new Object[0])).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - lastClickTime;
        if (0 < j && j < 500) {
            return true;
        }
        lastClickTime = currentTimeMillis;
        return false;
    }

    public static boolean isTouchOutOfRange(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e2bf8b8", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)})).booleanValue();
        }
        if (i + i5 < 0 || i - i5 > i3 || i2 + i6 < 0 || i2 - i6 > i4) {
            return true;
        }
        return false;
    }

    public static void resetKeyBoardHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b88104", new Object[0]);
        } else {
            SharedPreferencesUtil.addIntSharedPreference("Preference_KeyBoardHeight", DisplayUtil.dip2px(DEF_KEYBOARD_HEIGHT));
        }
    }

    public static boolean setImageUrl(TUrlImageView tUrlImageView, String str, boolean z, int i, int i2) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fce778b", new Object[]{tUrlImageView, str, new Boolean(z), new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (ApplicationUtil.isDebug()) {
            TLog.logd(TAG, "setImageUrl iv:", str);
        }
        if (tUrlImageView == null) {
            if (ApplicationUtil.isDebug()) {
                TLog.logd(TAG, "setImageUrl return false 1");
            }
            return false;
        }
        int i3 = R.id.tv_chatimg;
        Object tag = tUrlImageView.getTag(i3);
        if (tag instanceof String) {
            str2 = (String) tag;
        } else {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2) || !str2.equals(str)) {
            if (i > 0) {
                tUrlImageView.setPlaceHoldImageResId(i);
            }
            if (i2 > 0) {
                tUrlImageView.setErrorImageResId(i2);
            }
            if (z) {
                tUrlImageView.asyncSetImageUrl(str);
            } else {
                PhenixOptions phenixOptions = new PhenixOptions();
                phenixOptions.preloadWithSmall(true).scaleFromLarge(true);
                tUrlImageView.setImageUrl(str, phenixOptions);
            }
            tUrlImageView.setTag(i3, str);
            if (ApplicationUtil.isDebug()) {
                TLog.logd(TAG, "setImageUrl return true");
            }
            return true;
        }
        if (ApplicationUtil.isDebug()) {
            TLog.logd(TAG, "setImageUrl return false 2");
        }
        return false;
    }

    public static TextDrawable getIconFont(Context context, int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextDrawable) ipChange.ipc$dispatch("d794684", new Object[]{context, new Integer(i), new Integer(i2), str});
        }
        String str2 = str + "_" + i + "_" + i2;
        TextDrawable textDrawable = cacheDrawable.get(str2);
        if (textDrawable != null) {
            return textDrawable;
        }
        TextDrawable textDrawable2 = new TextDrawable(context);
        textDrawable2.setTextColor(i);
        textDrawable2.setTextSize(1, i2);
        textDrawable2.setText(str);
        textDrawable2.setTextAlign(Layout.Alignment.ALIGN_CENTER);
        try {
            if (sIconfont == null) {
                sIconfont = Typeface.createFromAsset(ApplicationUtil.getApplication().getAssets(), "uik_iconfont.ttf");
            }
            textDrawable2.setTypeface(sIconfont);
        } catch (Exception e) {
            e.printStackTrace();
        }
        TLog.logd(TAG, str2);
        cacheDrawable.put(str2, textDrawable2);
        return textDrawable2;
    }

    public static int getResourceIdentifier(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ddee71fb", new Object[]{context, str, str2})).intValue() : getResourceIdentifier(context, str, str2, false);
    }

    public static boolean setImageUrlIfShould(TUrlImageView tUrlImageView, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2500fee1", new Object[]{tUrlImageView, str})).booleanValue();
        }
        if (tUrlImageView == null) {
            if (ApplicationUtil.isDebug()) {
                TLog.logd(TAG, "Image is null");
            }
            return false;
        }
        int i = R.id.tv_chatimg;
        Object tag = tUrlImageView.getTag(i);
        if (tag instanceof String) {
            str2 = (String) tag;
        } else {
            str2 = "";
        }
        if (str2.equals(str)) {
            if (ApplicationUtil.isDebug()) {
                TLog.logd(TAG, "same Url has set already");
            }
            return false;
        }
        tUrlImageView.setTag(i, str);
        tUrlImageView.setImageUrl(str);
        if (ApplicationUtil.isDebug()) {
            TLog.logd(TAG, "setImageUrl");
        }
        return true;
    }

    public static boolean isFastDoubleClick(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a022624f", new Object[]{new Integer(i)})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - lastClickTime;
        if (0 < j && j < i) {
            return true;
        }
        lastClickTime = currentTimeMillis;
        return false;
    }

    public static boolean setImageUrl(TUrlImageView tUrlImageView, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9944ef91", new Object[]{tUrlImageView, str})).booleanValue() : setImageUrl(tUrlImageView, str, false, -1, -1);
    }

    public static boolean setImageUrl(TUrlImageView tUrlImageView, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5bd5a0b1", new Object[]{tUrlImageView, str, new Integer(i), new Integer(i2)})).booleanValue() : setImageUrl(tUrlImageView, str, false, i, i2);
    }
}
