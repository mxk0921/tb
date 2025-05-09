package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.storage.UltronTradeHybridStorage;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kcv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public final List<UltronTradeHybridStorage> f22573a = new CopyOnWriteArrayList();

    static {
        t2o.a(157286893);
    }

    @Deprecated
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c04ce1", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            UnifyLog.e("UltronTradeHybridStoragePool.setStorage", "key is empty");
        } else {
            UltronTradeHybridStorage b = b(str);
            if (b != null) {
                ((CopyOnWriteArrayList) this.f22573a).remove(b);
            }
        }
    }

    @Deprecated
    public final UltronTradeHybridStorage b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronTradeHybridStorage) ipChange.ipc$dispatch("a6ca8c00", new Object[]{this, str});
        }
        Iterator it = ((CopyOnWriteArrayList) this.f22573a).iterator();
        while (it.hasNext()) {
            UltronTradeHybridStorage ultronTradeHybridStorage = (UltronTradeHybridStorage) it.next();
            if (ultronTradeHybridStorage != null && TextUtils.equals(ultronTradeHybridStorage.getKey(), str)) {
                return ultronTradeHybridStorage;
            }
        }
        return null;
    }

    @Deprecated
    public UltronTradeHybridStorage c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronTradeHybridStorage) ipChange.ipc$dispatch("fd776743", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            UnifyLog.e("UltronTradeHybridStoragePool.getStorage", "key is empty");
            return null;
        }
        UltronTradeHybridStorage b = b(str);
        if (b != null && !b.isExpired()) {
            return b;
        }
        return null;
    }

    @Deprecated
    public void d(String str, JSONObject jSONObject, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d773cde", new Object[]{this, str, jSONObject, new Long(j)});
        } else if (TextUtils.isEmpty(str)) {
            UnifyLog.e("UltronTradeHybridStoragePool.setStorage", "key is empty");
        } else {
            UltronTradeHybridStorage b = b(str);
            if (b == null) {
                ((CopyOnWriteArrayList) this.f22573a).add(new UltronTradeHybridStorage(str, jSONObject, j));
            } else {
                b.update(jSONObject, j);
            }
        }
    }
}
