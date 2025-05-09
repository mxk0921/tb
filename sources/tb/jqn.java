package tb;

import android.content.Context;
import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.mobile.security.zim.biz.RecordProcessor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class jqn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static jqn b;

    /* renamed from: a  reason: collision with root package name */
    public RecordProcessor f22161a;

    static {
        t2o.a(245366849);
    }

    public static jqn a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jqn) ipChange.ipc$dispatch("b95745a5", new Object[0]);
        }
        if (b == null) {
            synchronized (jqn.class) {
                try {
                    if (b == null) {
                        b = new jqn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0aaaf23", new Object[]{this, str, map});
            return;
        }
        RecordProcessor recordProcessor = this.f22161a;
        if (recordProcessor != null) {
            recordProcessor.record(new MetaRecord("", "event", "20001117", str, 1), map);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        RecordProcessor recordProcessor = this.f22161a;
        if (recordProcessor != null) {
            recordProcessor.destroy();
            this.f22161a = null;
        }
        b = null;
    }

    public void b(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48838554", new Object[]{this, context, map});
            return;
        }
        String str = map.get("hummerId");
        String str2 = map.get("bizId");
        RecordProcessor instance = RecordProcessor.getInstance();
        this.f22161a = instance;
        if (instance == null) {
            this.f22161a = RecordProcessor.createInstance(context);
        }
        if (!StringUtil.isNullorEmpty(str)) {
            this.f22161a.addExtProperty(vqx.ZIM_IDENTIFY_EKYCID, str);
            this.f22161a.setUniqueID(str);
        } else if (!StringUtil.isNullorEmpty(str2)) {
            this.f22161a.setUniqueID(str2);
        }
        this.f22161a.setDestroyable(false);
    }
}
