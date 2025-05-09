package com.taobao.calendar.sdk.common;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class Step {
    private final CallBack cb;
    private int current;
    private int now;
    private final int vend;
    private final int vstart;

    static {
        t2o.a(414187555);
    }

    public Step(int i, int i2, CallBack callBack) {
        this.vstart = i;
        this.vend = i2;
        this.cb = callBack;
        if (i == i2) {
            callBack.done();
            return;
        }
        callBack.init(this);
        this.current = i;
        next();
    }

    public void next() {
        int i = this.current;
        if (i < this.vend) {
            CallBack callBack = this.cb;
            this.current = i + 1;
            callBack.exec(i);
            return;
        }
        this.cb.done();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class CallBack {
        private Step instance;

        static {
            t2o.a(414187556);
        }

        public void init(Step step) {
            this.instance = step;
        }

        public void next() {
            this.instance.next();
        }

        public void done() {
        }

        public void exec(int i) {
        }
    }
}
