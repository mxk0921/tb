package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class sp8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UT_EXPOSURE_SPM_A = "x-spm-a";
    public static final String UT_EXPOSURE_SPM_B = "x-spm-b";
    public static final String UT_EXPOSURE_SPM_C = "x-spm-c";
    public static final String UT_EXPOSURE_SPM_D = "x-spm-d";
    public static final String UT_EXPROSURE_ARGS = "UT_EXPROSURE_ARGS";
    public static final String UT_EXPROSURE_BLOCK = "UT_EXPROSURE_BLOCK";
    public static final String UT_EXPROSURE_VIEWID = "UT_EXPROSURE_VIEWID";
    public static final int ut_exposure_data_spm = -17006;
    public static final int ut_exposure_root_spm = -17005;
    public static final int ut_exprosure_common_info_tag = -17003;
    public static final int ut_exprosure_ignore_tag = -17004;
    public static final int ut_exprosure_tag = -17001;
    public static final int ut_exprosure_tag_for_weex = -17002;

    static {
        t2o.a(962593281);
    }

    public static void clearExposureForWeex(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("762b18d5", new Object[]{view});
        } else if (view == null) {
            un8.w(null, "error,view is null");
        } else {
            view.setTag(ut_exprosure_tag_for_weex, null);
        }
    }

    public static void clearIgnoreTagForExposureView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21db0a11", new Object[]{view});
        } else if (view != null) {
            view.setTag(ut_exprosure_ignore_tag, null);
        }
    }

    public static void clearViewGroupTagForExposureView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f7e9943", new Object[]{view});
        } else if (view != null) {
            view.setTag(-17007, null);
        }
    }

    public static boolean isExposureView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45f2f599", new Object[]{view})).booleanValue();
        }
        if (view == null || view.getTag(ut_exprosure_tag) == null) {
            return false;
        }
        return true;
    }

    public static boolean isExposureViewForWeex(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad8bf97b", new Object[]{view})).booleanValue();
        }
        if (view == null || view.getTag(ut_exprosure_tag_for_weex) == null) {
            return false;
        }
        return true;
    }

    public static boolean isIngoneExposureView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41d17335", new Object[]{view})).booleanValue();
        }
        if (view == null || view.getTag(ut_exprosure_ignore_tag) == null) {
            return false;
        }
        return true;
    }

    public static boolean isViewGroupExposureView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8854433", new Object[]{view})).booleanValue();
        }
        if (view == null || view.getTag(-17007) == null) {
            return false;
        }
        return true;
    }

    public static void setExposure(View view, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd38d6f", new Object[]{view, str, str2, map});
        } else if (view == null) {
            un8.w(null, "error,view is null");
        } else if (TextUtils.isEmpty(str)) {
            un8.w(null, "error,block is empty");
        } else if (TextUtils.isEmpty(str2)) {
            un8.w(null, "error,viewId is empty");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(UT_EXPROSURE_BLOCK, str);
            hashMap.put(UT_EXPROSURE_VIEWID, str2);
            if (map != null) {
                hashMap.put(UT_EXPROSURE_ARGS, map);
            }
            view.setTag(ut_exprosure_tag, hashMap);
        }
    }

    public static void setExposureForWeex(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e66e72a", new Object[]{view});
        } else if (view == null) {
            un8.w(null, "error,view is null");
        } else {
            view.setTag(ut_exprosure_tag_for_weex, "auto");
        }
    }

    public static void setIgnoreTagForExposureView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91698b5c", new Object[]{view});
        } else if (view != null) {
            view.setTag(ut_exprosure_ignore_tag, "user");
        }
    }

    public static void setViewGroupTagForExposureView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f69018", new Object[]{view});
        } else if (view != null) {
            view.setTag(-17007, "1");
        }
    }

    public static void setExposureSpmAB(View view, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120e43b7", new Object[]{view, str, str2});
        } else if (view == null) {
            un8.w(null, "error,view is null");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            un8.w(null, "spmA or spmB is empty");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(UT_EXPOSURE_SPM_A, str);
            hashMap.put(UT_EXPOSURE_SPM_B, str2);
            view.setTag(ut_exposure_root_spm, hashMap);
        }
    }

    public static void setExposureSpmCD(View view, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93011b77", new Object[]{view, str, str2});
        } else if (view == null) {
            un8.w(null, "error,view is null");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            un8.w(null, "spmC or spmD is empty");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(UT_EXPOSURE_SPM_C, str);
            hashMap.put(UT_EXPOSURE_SPM_D, str2);
            view.setTag(ut_exposure_data_spm, hashMap);
        }
    }
}
