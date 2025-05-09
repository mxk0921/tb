package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class qvt implements p9o {
    private boolean isTimeout;

    public qvt(boolean z) {
        this.isTimeout = z;
    }

    public abstract boolean isResultTimeout();

    @Override // tb.p9o
    public final boolean isTimeout() {
        if (!this.isTimeout) {
            return isResultTimeout();
        }
        return true;
    }

    public void setTimeout(boolean z) {
        this.isTimeout = z;
    }
}
