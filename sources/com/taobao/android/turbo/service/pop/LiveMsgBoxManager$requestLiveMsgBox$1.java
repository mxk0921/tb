package com.taobao.android.turbo.service.pop;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.turbo.base.service.pop.PopType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.cgm;
import tb.ckf;
import tb.j7j;
import tb.kqu;
import tb.mqu;
import tb.tpu;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "", Constants.SEND_TYPE_RES, "Ltb/j7j;", "<anonymous parameter 1>", "Ltb/xhv;", "invoke", "(Ljava/util/Map;Ltb/j7j;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class LiveMsgBoxManager$requestLiveMsgBox$1 extends Lambda implements u1a<Map<String, ? extends Object>, j7j, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ LiveMsgBoxManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveMsgBoxManager$requestLiveMsgBox$1(LiveMsgBoxManager liveMsgBoxManager) {
        super(2);
        this.this$0 = liveMsgBoxManager;
    }

    public static /* synthetic */ Object ipc$super(LiveMsgBoxManager$requestLiveMsgBox$1 liveMsgBoxManager$requestLiveMsgBox$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/pop/LiveMsgBoxManager$requestLiveMsgBox$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(Map<String, ? extends Object> map, j7j j7jVar) {
        invoke2(map, j7jVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, ? extends Object> map, j7j j7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245731b4", new Object[]{this, map, j7jVar});
            return;
        }
        ckf.g(map, Constants.SEND_TYPE_RES);
        ckf.g(j7jVar, "<anonymous parameter 1>");
        LiveMsgBoxManager liveMsgBoxManager = this.this$0;
        if (LiveMsgBoxManager.c(liveMsgBoxManager) && (map.get("data") instanceof Map)) {
            Object obj = map.get("data");
            if (obj != null) {
                Object obj2 = ((Map) obj).get("liveCapsule");
                if (kqu.m(obj2)) {
                    tpu.a.b(tpu.Companion, LiveMsgBoxManager.TAG, "requestLiveMsgBox success", null, 4, null);
                    Map map2 = (Map) obj2;
                    Object obj3 = map2.get("dayPeriodCount");
                    if (obj3 != null) {
                        LiveMsgBoxManager.e(liveMsgBoxManager, mqu.Companion.d(obj3, 100000));
                    }
                    Object obj4 = map2.get("sumPeriodCount");
                    if (obj4 != null) {
                        LiveMsgBoxManager.f(liveMsgBoxManager, mqu.Companion.d(obj4, 100000));
                    }
                    LiveMsgBoxManager.h(liveMsgBoxManager);
                    int d = mqu.Companion.d(map2.get("disappearTime"), 10) * 1000;
                    if (map2.get("nick") instanceof String) {
                        if (obj2 != null) {
                            Map d2 = kqu.d(obj2);
                            Object obj5 = ((Map) obj2).get("nick");
                            if (obj5 != null) {
                                String substring = ((String) obj5).substring(0, 8);
                                ckf.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                d2.put("nick", substring);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
                        }
                    }
                    PopType popType = PopType.POP_LIVE;
                    if (obj2 != null) {
                        LiveMsgBoxManager.a(liveMsgBoxManager).r(new cgm(popType, d, (Map) obj2, false, 8, null));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        }
    }
}
