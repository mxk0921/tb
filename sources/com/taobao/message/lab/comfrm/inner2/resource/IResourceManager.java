package com.taobao.message.lab.comfrm.inner2.resource;

import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceManager;", "Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceChangePublisher;", "", "filePartName", "fetchResource", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceProvider;", "resourceProvider", "Ltb/xhv;", "addResourceProvider", "(Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceProvider;)V", "", "isResourceChanged", "()Z", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IResourceManager extends IResourceChangePublisher {
    void addResourceProvider(IResourceProvider iResourceProvider);

    String fetchResource(String str);

    boolean isResourceChanged();
}
