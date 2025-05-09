package com.taobao.message.sp.framework.implement;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.sp.framework.service.ISimpleProfileService;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/taobao/message/sp/framework/implement/SimpleBaseProfileService;", "Lcom/taobao/message/sp/framework/service/ISimpleProfileService;", "mIdentifier", "", "mChannelType", "(Ljava/lang/String;Ljava/lang/String;)V", "getChannelType", "getIdentifier", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class SimpleBaseProfileService implements ISimpleProfileService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mChannelType;
    private final String mIdentifier;

    static {
        t2o.a(552599654);
        t2o.a(552599706);
    }

    public SimpleBaseProfileService(String str, String str2) {
        ckf.h(str, "mIdentifier");
        ckf.h(str2, "mChannelType");
        this.mIdentifier = str;
        this.mChannelType = str2;
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleDataService
    public String getChannelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44447fb2", new Object[]{this});
        }
        return this.mChannelType;
    }

    @Override // com.taobao.message.sp.framework.service.ISimpleDataService
    public String getIdentifier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this});
        }
        return this.mIdentifier;
    }
}
