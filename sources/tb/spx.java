package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.android.phone.zdoc.module.CaptureDocModule;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class spx implements ObjectDeserializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(245366892);
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("4cc07ecf", new Object[]{this, defaultJSONParser, type, obj});
        }
        JSONObject jSONObject = (JSONObject) defaultJSONParser.parse();
        JSONArray jSONArray = jSONObject.getJSONArray("scanAlgorithm");
        if (jSONArray == null || jSONArray.size() == 0) {
            try {
                int i = CaptureDocModule.f15161a;
                return (T) JSON.toJavaObject(jSONObject, CaptureDocModule.class);
            } catch (Exception e) {
                BioLog.e(e);
            }
        } else {
            try {
                return (T) JSON.toJavaObject(jSONObject, Class.forName("com.zoloz.android.phone.zdoc.module.ScanDocModule"));
            } catch (ClassNotFoundException e2) {
                BioLog.e(e2);
            }
        }
        throw new IllegalStateException("class not found");
    }
}
