package mtopsdk.mtop.global.init;

import mtopsdk.mtop.global.MtopConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IMtopInitTask {
    void executeCoreTask(MtopConfig mtopConfig);

    void executeExtraTask(MtopConfig mtopConfig);
}
