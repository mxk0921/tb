package dagger.internal;

import tb.gpm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
enum MembersInjectors$NoOpMembersInjector {
    INSTANCE;

    public void injectMembers(Object obj) {
        gpm.c(obj, "Cannot inject members into a null reference");
    }
}
