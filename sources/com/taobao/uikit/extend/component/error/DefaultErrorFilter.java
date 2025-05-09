package com.taobao.uikit.extend.component.error;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import org.json.JSONException;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DefaultErrorFilter extends AbsErrorFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DefaultErrorFilter";
    public Context context;
    public JSONObject filterRule;

    static {
        t2o.a(932184102);
    }

    public DefaultErrorFilter(Context context, String str) {
        this.context = context;
        try {
            this.filterRule = new JSONObject(str);
        } catch (JSONException e) {
            TLog.loge(TAG, "[DefaultErrorFilter] error", e);
            this.filterRule = new JSONObject();
        }
    }

    private String codeToSubTitleKey(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("485a7119", new Object[]{this, new Integer(i), str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (isNetworkError(str)) {
            return AbsErrorFilter.KEY_ERRORVIEW_NETWORKERROR_SUBTITLE;
        }
        if (isLimitError(i, str)) {
            return AbsErrorFilter.KEY_ERRORVIEW_LIMIT_ERROR_SUBTITLE;
        }
        if (isSysError(i, str)) {
            return AbsErrorFilter.KEY_ERRORVIEW_SYS_ERROR_SUBTITLE;
        }
        return "";
    }

    private String codeToTitleKey(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("602d5289", new Object[]{this, new Integer(i), str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (isNetworkError(str)) {
            return AbsErrorFilter.KEY_ERRORVIEW_NETWORKERROR_TITLE;
        }
        if (isLimitError(i, str)) {
            return AbsErrorFilter.KEY_ERRORVIEW_LIMIT_ERROR_TITLE;
        }
        if (isSysError(i, str)) {
            return AbsErrorFilter.KEY_ERRORVIEW_SYS_ERROR_TITLE;
        }
        return "";
    }

    public static /* synthetic */ Object ipc$super(DefaultErrorFilter defaultErrorFilter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/error/DefaultErrorFilter");
    }

    @Override // com.taobao.uikit.extend.component.error.AbsErrorFilter
    public int filterIcon(Error error) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8214222", new Object[]{this, error})).intValue();
        }
        if (isNetworkError(error.errorCode)) {
            return R.drawable.uik_error_icon_v2;
        }
        if (isLimitError(error.responseCode, error.errorCode)) {
            return R.drawable.uik_limit_error_icon_v2;
        }
        if (isSysError(error.responseCode, error.errorCode)) {
            return R.drawable.uik_sys_error_icon_v2;
        }
        return -1;
    }

    @Override // com.taobao.uikit.extend.component.error.AbsErrorFilter
    public String filterSubTitle(Error error, CharSequence charSequence) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66d1222c", new Object[]{this, error, charSequence});
        }
        if (TextUtils.isEmpty(charSequence)) {
            str = "";
        } else {
            str = charSequence.toString();
        }
        String codeToSubTitleKey = codeToSubTitleKey(error.responseCode, String.valueOf(error.errorCode));
        if (TextUtils.isEmpty(codeToSubTitleKey)) {
            codeToSubTitleKey = codeToSubTitleKey(error.responseCode, error.errorCode);
        }
        String optString = this.filterRule.optString(codeToSubTitleKey);
        if (TextUtils.isEmpty(optString)) {
            return str;
        }
        return optString;
    }

    @Override // com.taobao.uikit.extend.component.error.AbsErrorFilter
    public String filterTitle(Error error, CharSequence charSequence) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9045b85c", new Object[]{this, error, charSequence});
        }
        if (TextUtils.isEmpty(charSequence)) {
            str = "";
        } else {
            str = charSequence.toString();
        }
        String codeToTitleKey = codeToTitleKey(error.responseCode, String.valueOf(error.errorCode));
        if (TextUtils.isEmpty(codeToTitleKey)) {
            codeToTitleKey = codeToTitleKey(error.responseCode, error.errorCode);
        }
        String optString = this.filterRule.optString(codeToTitleKey);
        if (TextUtils.isEmpty(optString)) {
            return str;
        }
        return optString;
    }
}
