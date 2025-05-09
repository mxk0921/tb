package com.taobao.android.tschedule.taskcontext;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.taskcontext.baseparams.TimeContent;
import com.taobao.media.MediaConstant;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MtopTaskContext extends TaskContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public MtopTaskParams params;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class MtopTaskParams implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String api;
        public JSONObject apiParams;
        public String authCode;
        public String customHost;
        public Map<String, String> headers;
        public String jsonType;
        public String miniAppkey;
        public List<String> mtopIgnore;
        public boolean needEcode;
        public boolean needSession;
        public String openAppKey;
        public String openBizCode;
        public String openBizData;
        public boolean parseUrlFirst;
        public List<String> queryBlackList;
        public String requestAppkey;
        public String requestType;
        public List<TimeContent> timeContent;
        public String ua;
        public String unit;
        public boolean urlSoftMatch;
        public String urlSoftMatchKey;
        public String urlSoftMatchWhitelistKey;
        public String version;
        public String workThread;
        public long timeout = 5000;
        public boolean asyncCallback = false;

        static {
            t2o.a(329253000);
        }

        public String toString() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder("api=");
            sb.append(this.api);
            sb.append(", version=");
            sb.append(this.version);
            sb.append(", requestType=");
            sb.append(this.requestType);
            sb.append(", needEcode=");
            sb.append(this.needEcode);
            sb.append(", needSession=");
            sb.append(this.needSession);
            sb.append(", needSession=");
            sb.append(this.needSession);
            sb.append(", jsonType=");
            sb.append(this.jsonType);
            sb.append(", mtopIgnore=");
            List<String> list = this.mtopIgnore;
            String str2 = MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
            sb.append(list == null ? str2 : list.toString());
            sb.append(", queryBlackList=");
            List<String> list2 = this.queryBlackList;
            if (list2 != null) {
                str2 = list2.toString();
            }
            sb.append(str2);
            sb.append(", timeout=");
            sb.append(this.timeout);
            sb.append(", unit=");
            sb.append(this.unit);
            sb.append(", openBizCode=");
            sb.append(this.openBizCode);
            sb.append(", miniAppkey=");
            sb.append(this.miniAppkey);
            sb.append(", requestAppkey=");
            sb.append(this.requestAppkey);
            sb.append(", authCode=");
            sb.append(this.authCode);
            sb.append(", openBizData=");
            sb.append(this.openBizData);
            sb.append(", customHost=");
            sb.append(this.customHost);
            sb.append(", workThread=");
            sb.append(this.workThread);
            sb.append(", headers=");
            Map<String, String> map = this.headers;
            if (map == null) {
                str = "{}";
            } else {
                str = map.toString();
            }
            sb.append(str);
            return sb.toString();
        }
    }

    static {
        t2o.a(329252999);
    }

    public static /* synthetic */ Object ipc$super(MtopTaskContext mtopTaskContext, String str, Object... objArr) {
        if (str.hashCode() == -2128160755) {
            return super.toString();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/taskcontext/MtopTaskContext");
    }

    @Override // com.taobao.android.tschedule.taskcontext.TaskContext
    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", params=");
        MtopTaskParams mtopTaskParams = this.params;
        if (mtopTaskParams == null) {
            str = "{}";
        } else {
            str = mtopTaskParams.toString();
        }
        sb.append(str);
        return sb.toString();
    }
}
