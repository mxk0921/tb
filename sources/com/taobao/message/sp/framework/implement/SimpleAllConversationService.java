package com.taobao.message.sp.framework.implement;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/taobao/message/sp/framework/implement/SimpleAllConversationService;", "Lcom/taobao/message/sp/framework/implement/SimpleBaseConversationService;", "mIdentifier", "", "mChannelType", "(Ljava/lang/String;Ljava/lang/String;)V", "getListConversationsChannelList", "", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SimpleAllConversationService extends SimpleBaseConversationService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mChannelType;
    private final String mIdentifier;

    static {
        t2o.a(552599641);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleAllConversationService(String str, String str2) {
        super(str, str2);
        ckf.h(str, "mIdentifier");
        ckf.h(str2, "mChannelType");
        this.mIdentifier = str;
        this.mChannelType = str2;
    }

    public static /* synthetic */ Object ipc$super(SimpleAllConversationService simpleAllConversationService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/sp/framework/implement/SimpleAllConversationService");
    }

    @Override // com.taobao.message.sp.framework.implement.SimpleBaseConversationService
    public List<String> getListConversationsChannelList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f4c553bb", new Object[]{this});
        }
        return yz3.l("bc", "notice");
    }
}
