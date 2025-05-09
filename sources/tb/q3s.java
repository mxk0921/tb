package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class q3s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_QUEUE_SIZE = 300;

    /* renamed from: a  reason: collision with root package name */
    public final Queue<ChatMessage> f26493a = new ConcurrentLinkedDeque();
    public final ConcurrentLinkedQueue<ChatMessage> b = new ConcurrentLinkedQueue<>();

    static {
        t2o.a(806356198);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        ((ConcurrentLinkedDeque) this.f26493a).clear();
        this.b.clear();
    }

    public boolean b(ChatMessage chatMessage) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4cdfaca", new Object[]{this, chatMessage})).booleanValue();
        }
        if (!(chatMessage == null || chatMessage.mCommentId == null)) {
            Iterator it = ((ConcurrentLinkedDeque) this.f26493a).iterator();
            while (it.hasNext()) {
                ChatMessage chatMessage2 = (ChatMessage) it.next();
                if (chatMessage2 != null && (str2 = chatMessage2.mCommentId) != null && chatMessage.mCommentId.equals(str2)) {
                    return true;
                }
            }
            Iterator<ChatMessage> it2 = this.b.iterator();
            while (it2.hasNext()) {
                ChatMessage next = it2.next();
                if (next != null && (str = next.mCommentId) != null && chatMessage.mCommentId.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2751477", new Object[]{this})).longValue();
        }
        return ((ConcurrentLinkedDeque) this.f26493a).size() + this.b.size();
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        if (!((ConcurrentLinkedDeque) this.f26493a).isEmpty() || !this.b.isEmpty()) {
            return false;
        }
        return true;
    }

    public ChatMessage g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatMessage) ipChange.ipc$dispatch("c555e90b", new Object[]{this});
        }
        if (((ConcurrentLinkedDeque) this.f26493a).isEmpty()) {
            return this.b.peek();
        }
        return (ChatMessage) ((ConcurrentLinkedDeque) this.f26493a).peek();
    }

    public ChatMessage h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatMessage) ipChange.ipc$dispatch("cdef927", new Object[]{this});
        }
        if (((ConcurrentLinkedDeque) this.f26493a).isEmpty()) {
            return this.b.poll();
        }
        return (ChatMessage) ((ConcurrentLinkedDeque) this.f26493a).poll();
    }

    public boolean i(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0b12e7c", new Object[]{this, chatMessage})).booleanValue();
        }
        if (chatMessage == null) {
            return false;
        }
        if (e(chatMessage)) {
            return this.b.offer(chatMessage);
        }
        return ((ConcurrentLinkedDeque) this.f26493a).offer(chatMessage);
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return (int) d();
    }

    public final boolean e(ChatMessage chatMessage) {
        HashMap<String, String> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bb0b483", new Object[]{this, chatMessage})).booleanValue();
        }
        if (chatMessage == null || (hashMap = chatMessage.renders) == null) {
            return false;
        }
        String str = hashMap.get(yj4.PARAM_CHAT_RENDERS_ENHANCE);
        return "follow".equals(str) || "share".equals(str) || "fandomShare".equals(str);
    }
}
