package anetwork.channel;

import anetwork.channel.statist.StatisticData;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NetworkEvent {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface FinishEvent {
        String getDesc();

        int getHttpCode();

        StatisticData getStatisticData();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface ProgressEvent {
        byte[] getBytedata();

        String getDesc();

        int getFragmentIndex();

        int getIndex();

        int getSize();

        int getTotal();
    }

    static {
        t2o.a(607125970);
    }
}
