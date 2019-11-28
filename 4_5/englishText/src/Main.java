public class Main {
    public static void main(String[] args) {
        String text = "Bram Murton, a geologist with the UK’s National Oceanography Centre, says that if all the cars on Europe’s roads are electric by 2040, and if they use the same kind of batteries as the Tesla Model 3, that would require 28 times more cobalt than is produced right now.At the moment more than 60% of all cobalt comes from the Democratic Republic of Congo. For decades allegations of corruption and human rights abuses have swirled around parts of its mining industry.Last year Amnesty International said there were children as young as seven working in the DRC’s cobalt mines, “in narrow man-made tunnels, at risk of fatal accidents and serious lung disease”. Microsoft, Renault and Huawei were among the companies named as failing to check if their supplies of cobalt involved child labour. They’ve all since promised to improve their systems for checking how cobalt is sourced.";
        text = text.replaceAll("\\p{Punct}", "");
        String[] words = text.split("\\s");


        for(int i = 0; i < words.length; i++ )
        {

            System.out.println(words[i]);

        }
    }
}
