/*
package com.chunjae.tqgpt.api;

import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@Controller
@Slf4j
public class WeatherAPI {
    public static void weather(String streetAddr) {

        LocalDate currentDay = LocalDate.now();
        DateTimeFormatter Dateformatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String formattedDate = currentDay.format(Dateformatter);


        LocalTime currentTime = LocalTime.now();
        LocalTime oneHourAgo = currentTime.minusHours(1);
        DateTimeFormatter Timeformatter = DateTimeFormatter.ofPattern("HHmm");
        String formattedTime = oneHourAgo.format(Timeformatter);
        */
/* 기상청 실황API는 발표자료가 매 시 30분에 생성, 40분에 API가 제공되며 그것도 시간이 조금 지체되기에 1시간 전을 호출하여야 한다. *//*


        try {
            String apiUrl = "https://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst";
            String apiKey = "bjzcjXp5BZXRA5vnoLptqnIRMijNPrHGZAwXuxDO1XkJ5j8V5zSpfRVB4OedKWbyiVdgfUGga8zoxwTnQnO00w%3D%3D";
            String pageNo = "1";
            String numOfRows = "1000";
            String dataType = "JSON";

            JSONObject latlong = MapNaver.latLong(streetAddr);

            Map<String, Double> rs = MapConvert.convertToCoordinates(latlong.get("x").toString(), latlong.get("y").toString());

            double nx = rs.get('x'); // X 좌표
            double ny = rs.get('y'); // Y 좌표


            String requestUrl = apiUrl + "?serviceKey=" + apiKey + "&pageNo=" + pageNo +
                "&numOfRows=" + numOfRows + "&dataType=" + dataType + "&base_date=" +
                formattedDate + "&base_time=" + formattedTime + "&nx=" + nx + "&ny=" + ny;

            // HTTP GET 요청 보내기
            URL url = new URL(requestUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // 응답 읽기
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuffer response = new StringBuffer();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // 응답 데이터 출력
                log.info(response.toString());
            } else {
                System.out.println("" + responseCode);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}*/
