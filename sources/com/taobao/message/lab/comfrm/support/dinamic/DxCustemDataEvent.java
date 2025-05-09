package com.taobao.message.lab.comfrm.support.dinamic;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/taobao/message/lab/comfrm/support/dinamic/DxCustemDataEvent;", "Lcom/taobao/android/dinamicx/expression/event/DXEvent;", "", "eventId", "<init>", "(J)V", "", "key", "", "value", "Ltb/xhv;", "put", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "context", "Ljava/util/Map;", "getContext", "()Ljava/util/Map;", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DxCustemDataEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, Object> context = new LinkedHashMap();
    private String name = null;

    static {
        t2o.a(537919799);
    }

    public DxCustemDataEvent(long j) {
        super(j);
    }

    public static /* synthetic */ Object ipc$super(DxCustemDataEvent dxCustemDataEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/dinamic/DxCustemDataEvent");
    }

    public final Map<String, Object> getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7ab803b5", new Object[]{this});
        }
        return this.context;
    }

    public final String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    public final void put(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97b403c", new Object[]{this, str, obj});
            return;
        }
        ckf.g(str, "key");
        ckf.g(obj, "value");
        this.context.put(str, obj);
    }

    public final void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.name = str;
        }
    }
}
