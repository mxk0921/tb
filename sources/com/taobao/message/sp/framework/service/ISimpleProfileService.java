package com.taobao.message.sp.framework.service;

import com.taobao.message.kit.core.IObserver;
import com.taobao.message.sp.framework.model.SimpleProfile;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J9\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\r\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/taobao/message/sp/framework/service/ISimpleProfileService;", "Lcom/taobao/message/sp/framework/service/ISimpleDataService;", "", "", "targetIds", "bizType", "Lcom/taobao/message/kit/core/IObserver;", "Lcom/taobao/message/sp/framework/model/SimpleProfile;", "observer", "Ltb/xhv;", "listProfiles", "(Ljava/util/List;Ljava/lang/String;Lcom/taobao/message/kit/core/IObserver;)V", "targetNicks", "listProfilesByNick", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ISimpleProfileService extends ISimpleDataService {
    void listProfiles(List<String> list, String str, IObserver<List<SimpleProfile>> iObserver);

    void listProfilesByNick(List<String> list, String str, IObserver<List<SimpleProfile>> iObserver);
}
