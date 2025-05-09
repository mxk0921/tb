package mtopsdk.mtop.upload.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class FileUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.FileUtil";

    static {
        t2o.a(595591199);
    }

    public static String parseErrCode(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be7b7781", new Object[]{map});
        }
        String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, UploadConstants.X_ERROR_CODE);
        if (StringUtils.isBlank(singleHeaderFieldByKey)) {
            return UploadConstants.ERRCODE_FILE_UPLOAD_FAIL;
        }
        return singleHeaderFieldByKey;
    }

    public static String parseErrMsg(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98423531", new Object[]{map});
        }
        String urlDecode = MtopUtils.urlDecode(HeaderHandlerUtil.getSingleHeaderFieldByKey(map, UploadConstants.X_ERROR_MSG), "utf-8");
        if (StringUtils.isBlank(urlDecode)) {
            return UploadConstants.ERRMSG_FILE_UPLOAD_FAIL;
        }
        return urlDecode;
    }

    public static String parseUrlLocation(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39bac153", new Object[]{map});
        }
        String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, UploadConstants.X_DATA);
        if (StringUtils.isNotBlank(singleHeaderFieldByKey)) {
            return MtopUtils.urlDecode(singleHeaderFieldByKey, "utf-8");
        }
        return singleHeaderFieldByKey;
    }
}
