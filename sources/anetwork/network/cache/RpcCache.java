package anetwork.network.cache;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RpcCache implements Serializable {
    private static final long serialVersionUID = 7346667584637656956L;
    public byte[] body;
    public long cacheCreateTime;
    public CacheStatus cacheStatus;
    public String etag;
    public Map<String, List<String>> header;
    public String lastModified;
    public long maxAge;
    public boolean offline;
    public String version;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum CacheStatus {
        FRESH,
        NEED_UPDATE,
        TIMEOUT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(CacheStatus cacheStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anetwork/network/cache/RpcCache$CacheStatus");
        }

        public static CacheStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CacheStatus) ipChange.ipc$dispatch("eadf98ed", new Object[]{str});
            }
            return (CacheStatus) Enum.valueOf(CacheStatus.class, str);
        }
    }

    static {
        t2o.a(589299716);
    }
}
