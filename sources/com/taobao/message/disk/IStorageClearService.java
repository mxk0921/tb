package com.taobao.message.disk;

import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IStorageClearService {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface Keys {
        public static final String OUTER = "outer";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface KeysInner {
        public static final String INTERACT = "interact";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class Options {
        public int daysAgo;
        public int mode;

        static {
            t2o.a(529530926);
        }
    }

    void cleanUpLocalConversation(long j, Map<String, Object> map);

    DeleteResult delete(String str, Options options);

    void register(String str, String str2);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class DeleteResult {
        public String errorMsg;
        public boolean isSuccess = true;
        public int size;

        static {
            t2o.a(529530923);
        }

        public DeleteResult(int i) {
            this.size = i;
        }

        public DeleteResult(String str) {
            this.errorMsg = str;
        }
    }
}
