/* a6_tester_basic.c
 *
 *    A tester which uses a fixed array of Observation objects
 *       (useful for testing the functions to compute station extremes
 *           and daily averages without worrying about file I/O).
 *
 *              B. Bird - 2022-11-19
 *              */

#include <stdio.h>
#include "temperature_data.h"

int main(){
    Observation obs_array[] = {
        
        { {2022, 6, 10}, 1, 11, 7, 1 },
        { {2022, 6, 10}, 1, 16, 7, 2 },

        { {2022, 6, 10}, 13, 21, 9, 10 },
        { {2022, 6, 10}, 13, 26, 9, 20 },

        { {2018, 3, 4}, 15, 12, 1, 15 },
        { {2018, 3, 4}, 19, 13, 1, 25 },

        { {2022, 9, 7}, 18, 7, 1, 9 },
        { {2022, 9, 7}, 11, 1, 1, 12 },

        { {2022, 11, 21}, 16,  1, 10, 8 },
        { {2022, 11, 21}, 18, 39, 12, 14 },
    };
    int num_observations = 10;

    printf("Station Extremes:\n");
    print_station_extremes(num_observations, obs_array);
    return 0;
}
